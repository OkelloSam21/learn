package com.samuelokello.statemanagement.data

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel : ViewModel() {
//    var userName = mutableStateOf("")
//        private set
//
//    fun onUserNameChange(name: String){
//        userName.value = name
//    }

    private val _state = MutableStateFlow(SignInUiState())
    val state = _state.asStateFlow()

    fun onNameChanged(userName: String) {
        _state.update {
            it.copy(userName = userName)
        }
    }

    fun onEmailChanged(email: String) {
        _state.update {
            it.copy(userName = email)
        }
    }


}

data class SignInUiState(
    val userName: String = "",
    val email: String = ""
)
