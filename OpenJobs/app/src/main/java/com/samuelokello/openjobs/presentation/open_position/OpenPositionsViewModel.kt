package com.samuelokello.openjobs.presentation.open_position

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.samuelokello.openjobs.data.remote.helper.Resource
import com.samuelokello.openjobs.domain.model.Position
import com.samuelokello.openjobs.domain.use_case.get_open_positions.FetchOpenPositionCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OpenPositionsViewModel @Inject constructor(private val fetchOpenPositions: FetchOpenPositionCase): ViewModel(){
    private val _positions = MutableStateFlow(PositionState())
    val positions = _positions.asStateFlow()

    init{
        fetchPositions()
    }

    private fun fetchPositions() {
        viewModelScope.launch{
            when(val result = fetchOpenPositions()){
                is Resource.Success -> {
                    _positions.update {
                        it.copy(
                            isLoading = false,
                            data = result.data ?: emptyList()
                        )
                    }
                }
                is Resource.Error -> {
                    _positions.update {
                        it.copy(
                            isLoading = false,
                            error = result.message ?: "An unexpected error occurred"
                        )
                    }
                }
            }
        }
    }
}

data class PositionState(
    val data: List<Position> = emptyList(),
    val isLoading: Boolean = false,
    val error: String = ""
)