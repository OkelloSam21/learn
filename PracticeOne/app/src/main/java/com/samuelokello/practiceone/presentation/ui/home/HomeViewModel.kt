package com.samuelokello.practiceone.presentation.ui.home

import androidx.lifecycle.ViewModel
import com.samuelokello.practiceone.data.Experience
import com.samuelokello.practiceone.data.Preference
import com.samuelokello.practiceone.domain.HomeRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel(private val repository: HomeRepository): ViewModel() {
    private val _homeUiState = MutableStateFlow(HomeUiState())
    val homeUiState = _homeUiState.asStateFlow()
    init {
        getExperiences()
    }

    private fun getExperiences() {
        _homeUiState.value = HomeUiState(isLoading = true)
        val experiences = repository.getExperiences()
        _homeUiState.value = HomeUiState(isLoading = false, experiences = experiences)
    }

    fun getPreferences() {
        val preferences = repository.getPreferences()
        _homeUiState.value = _homeUiState.value.copy(preferences = preferences)
    }


}
data class HomeUiState(
    val isLoading: Boolean = true,
    val experiences: List<Experience> = emptyList(),
    val preferences: List<Preference> = emptyList()
)