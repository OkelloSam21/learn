package com.samuelokello.mindease

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.samuelokello.mindease.presentation.model.TipRepository
import com.samuelokello.mindease.presentation.ui.AppBar
import com.samuelokello.mindease.presentation.ui.MindEaseList
import com.samuelokello.mindease.ui.theme.MindEaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MindEaseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MindEaseApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MindEaseApp(modifier: Modifier) {
    Scaffold(
        topBar = { AppBar() },
    ) { innerPadding ->
        val context = LocalContext.current
        val tips = TipRepository.tips
        MindEaseList(
            tips = tips,
            contentPadding = innerPadding,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MindEaseAppPrev() {
    MindEaseTheme {
        MindEaseApp(modifier = Modifier)
    }
}
