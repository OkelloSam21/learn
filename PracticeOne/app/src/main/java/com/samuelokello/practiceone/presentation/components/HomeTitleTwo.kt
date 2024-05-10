package com.samuelokello.practiceone.presentation.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.samuelokello.practiceone.R

@Composable
fun HomeTitleTwo() {
    Text(
        text = stringResource(id = R.string.find_your_experience),
        style = MaterialTheme.typography.displayMedium
    )
}