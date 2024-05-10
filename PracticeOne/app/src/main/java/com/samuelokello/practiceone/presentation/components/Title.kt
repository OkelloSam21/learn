package com.samuelokello.practiceone.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.samuelokello.practiceone.R

@Suppress("ktlint:standard:function-naming")
@Composable
fun HomeTitle() {
    Text(
        text = stringResource(id = R.string.find_your_experience),
        style = MaterialTheme.typography.displayLarge,
        modifier =
            Modifier.padding(
                horizontal = 16.dp,
                vertical = 8.dp,
            ),
    )
}
