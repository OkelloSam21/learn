package com.samuelokello.openjobs.presentation.open_position.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.samuelokello.openjobs.R
import coil.compose.AsyncImage
import com.samuelokello.openjobs.domain.model.Position
import com.samuelokello.openjobs.presentation.open_position.OpenPositionsViewModel

@Composable
fun PositionItem(
    position: Position,
    modifier: Modifier = Modifier
) {
//    val viewModel: OpenPositionsViewModel = viewModel()
//    val positions = viewModel.positions.collectAsState().value
    Card(
        modifier = modifier,
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_small))
        ){
            AsyncImage(
                model = position.image,
                contentDescription = null,
            )
            Column {
                Text(text = position.companyDescription)
                Text(text = position.salaryRange)
            }
        }
    }
}
