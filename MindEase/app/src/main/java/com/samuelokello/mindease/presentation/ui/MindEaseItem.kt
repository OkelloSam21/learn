package com.samuelokello.mindease.presentation.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.Spring.DampingRatioLowBouncy
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samuelokello.mindease.R
import com.samuelokello.mindease.presentation.model.Tip
import com.samuelokello.mindease.presentation.model.TipRepository
import com.samuelokello.mindease.ui.theme.MindEaseTheme

@Composable
fun MindEaseList(
    tips: List<Tip>,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    val visibleState =
        remember {
            MutableTransitionState(false).apply {
                targetState = true
            }
        }

    AnimatedVisibility(
        visibleState = visibleState,
        enter =
            fadeIn(
                animationSpec = spring(dampingRatio = DampingRatioLowBouncy),
            ),
        exit = fadeOut(),
    ) {
        LazyColumn(
            contentPadding = contentPadding,
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 8.dp),
        ) {
            items(tips) { tip ->
                MindEaseItem(
                    tip = tip,
                    modifier =
                    Modifier,
//                            .padding(horizontal = 8.dp, vertical = 16.dp),
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

@Suppress("ktlint:standard:function-naming")
@Composable
fun MindEaseItem(
    tip: Tip,
    modifier: Modifier = Modifier,
) {
    var visibleState =
        remember {
            MutableTransitionState(false).apply {
                targetState = true
            }
        }

    Card(
        elevation =
            CardDefaults.elevatedCardElevation(
                defaultElevation = 2.dp,
                pressedElevation = 3.dp,
            ),
    ) {
        Column(
            modifier =
                Modifier
                    .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            val days = stringArrayResource(id = R.array.days)
            Text(
                text = days[tip.dayRes],
                style = MaterialTheme.typography.labelSmall,
            )
            Text(
                text = stringResource(id = tip.titleRes),
                style = MaterialTheme.typography.bodyLarge,
            )

            Image(
                painter = painterResource(id = tip.imageRes),
                contentDescription = null,
                modifier =
                    Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .clickable {
                            visibleState.targetState = !visibleState.targetState
                        },
            )

            AnimatedVisibility(
                visibleState = visibleState,
                enter =
                    fadeIn(
                        animationSpec = spring(dampingRatio = DampingRatioLowBouncy),
                    ),
                exit = fadeOut(),
            ) {
                Text(
                    text = stringResource(id = tip.descriptionRes),
                    style = MaterialTheme.typography.bodyLarge,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ItemPrev() {
    val context = LocalContext.current
    val items = TipRepository.tips
    Surface(modifier = Modifier.fillMaxSize()) {
        MindEaseTheme {
            MindEaseList(
                tips = items,
            )
        }
    }
}
