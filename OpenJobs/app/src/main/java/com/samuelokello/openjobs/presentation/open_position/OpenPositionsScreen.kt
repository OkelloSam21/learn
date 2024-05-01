package com.samuelokello.openjobs.presentation.open_position

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.samuelokello.openjobs.domain.model.Position
import com.samuelokello.openjobs.presentation.open_position.components.PositionItem
import com.samuelokello.openjobs.presentation.open_position.components.PositionsAppBar

@Composable
fun OpenPositionScreen(
    viewModel: OpenPositionsViewModel,
    modifier: Modifier = Modifier
) {
    Scaffold (
        topBar = {
            PositionsAppBar()
        },
        modifier = modifier
    ){it ->
        val positions = viewModel.positions.collectAsState().value.data
        LazyColumn (contentPadding = it){
            items(positions){position ->
                PositionItem(
                    position = position,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}