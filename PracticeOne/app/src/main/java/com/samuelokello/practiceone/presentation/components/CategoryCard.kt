package com.samuelokello.practiceone.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.samuelokello.practiceone.data.Category

@Suppress("ktlint:standard:function-naming")
@Composable
fun CategoryCard(
    category: Category,
    modifier: Modifier = Modifier,
) {
    var isSelected by rememberSaveable { mutableStateOf(false) }
    Card(
        elevation =
            CardDefaults.cardElevation(
                defaultElevation = 1.dp,
            ),
        colors =
            CardDefaults.cardColors(
                containerColor = if (!isSelected) MaterialTheme.colorScheme.surface else MaterialTheme.colorScheme.primaryContainer,
                contentColor = if (!isSelected) MaterialTheme.colorScheme.onSurfaceVariant else MaterialTheme.colorScheme.onPrimaryContainer,
            ),
        onClick = { isSelected = !isSelected },
        shape = RoundedCornerShape(20.dp),
        modifier =
            modifier
                .padding(10.dp),
    ) {
        Text(
            text = stringResource(id = category.title),
            style = MaterialTheme.typography.bodyLarge,
            modifier = modifier.padding(10.dp),
        )
    }
}
