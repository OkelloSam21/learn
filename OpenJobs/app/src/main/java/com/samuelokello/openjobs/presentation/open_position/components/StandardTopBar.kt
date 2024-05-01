package com.samuelokello.openjobs.presentation.open_position.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PositionsAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Row (
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "Open Positions",
                    style = MaterialTheme.typography.headlineMedium
                )
            }
        }
    )
}

@Preview
@Composable
fun AppBarPreview() {
    PositionsAppBar()
}