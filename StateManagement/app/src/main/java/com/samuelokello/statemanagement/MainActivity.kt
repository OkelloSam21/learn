package com.samuelokello.statemanagement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samuelokello.statemanagement.data.MainViewModel
import com.samuelokello.statemanagement.data.SignInEvent
import com.samuelokello.statemanagement.ui.theme.StatemanagementTheme

class MainActivity : ComponentActivity() {

    val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            StatemanagementTheme {
                SignInForm(
                    viewModel = viewModel,
                    onEvent = viewModel::onEvent
                )
            }
        }
    }
}
@Composable
fun SignInForm(viewModel: MainViewModel, onEvent:(event:SignInEvent) -> Unit) {
    val state = viewModel.state.collectAsState()
    val context = LocalContext.current

    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        OutlinedTextField(
            value = state.value.userName,
            onValueChange = { onEvent(SignInEvent.OnUserNameUpdate(it))},
            label = { Text(text = "Uesr name")}
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = { onEvent(SignInEvent.OnSignUpClicked(state.value.userName, context))}
        ) {
            Text(text = "Sign Up")
        }
    }

}
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by remember { mutableStateOf(0) }

        if (count > 0) {
            // This text is present if the button has been clicked
            // at least once; absent otherwise
            Text("You've had $count glasses.")
        }
        Button(onClick = { count++ }, Modifier.padding(top = 8.dp)) {
            Text("Add one")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StatemanagementTheme {
    }
}