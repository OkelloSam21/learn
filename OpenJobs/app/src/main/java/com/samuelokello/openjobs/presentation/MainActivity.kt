package com.samuelokello.openjobs.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.samuelokello.openjobs.presentation.open_position.OpenPositionScreen
import com.samuelokello.openjobs.presentation.open_position.OpenPositionsViewModel
import com.samuelokello.openjobs.presentation.theme.OpenJobsTheme
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel = ViewModelProvider(this)[OpenPositionsViewModel::class.java]
        setContent {
            OpenJobsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    OpenPositionScreen(viewModel = viewModel)
                }
            }
        }
    }
}
