package com.samuelokello.practiceone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.samuelokello.practiceone.presentation.theme.PracticeOneTheme
import com.samuelokello.practiceone.presentation.ui.home.HomeScreenContent
import com.samuelokello.practiceone.presentation.ui.home.HomeViewModel
import com.samuelokello.practiceone.repository.HomeRepositoryImpl

class MainActivity : ComponentActivity() {
    val homeRepository = HomeRepositoryImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val vm: HomeViewModel by viewModels {
            object : ViewModelProvider.Factory {
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return HomeViewModel(homeRepository) as T
                }
            }
        }
        setContent {
            PracticeOneTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreenContent(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
