package com.samuelokello.statemanagement.data

import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.AndroidViewModel
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

    fun onEvent(event: SignInEvent) {
        when(event) {
            is SignInEvent.OnUserNameUpdate -> {
                _state.update {
                    it.copy(userName = event.userName)
                }
            }

            is SignInEvent.OnSignUpClicked -> {
                SignUp(event.userName, event.context)
            }

            else -> {}
        }

    }

    fun SignUp( userName: String, context: Context) {
        Toast.makeText(
            context,
            "Sign Up clicked",
            Toast.LENGTH_LONG
        ).show()
    }
}

data class SignInUiState(
    val userName: String = "",
    val email: String = ""
)

sealed interface SignInEvent {
    data class OnUserNameUpdate(val userName: String): SignInEvent
    data class OnSignUpClicked(val userName: String, val context: Context): SignInEvent

}
