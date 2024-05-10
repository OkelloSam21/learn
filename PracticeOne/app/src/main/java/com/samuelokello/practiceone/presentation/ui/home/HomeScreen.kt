package com.samuelokello.practiceone.presentation.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.samuelokello.practiceone.R
import com.samuelokello.practiceone.data.Category
import com.samuelokello.practiceone.data.Experience
import com.samuelokello.practiceone.data.Preference
import com.samuelokello.practiceone.presentation.components.AppBAr
import com.samuelokello.practiceone.presentation.components.CategoryCard
import com.samuelokello.practiceone.presentation.components.CircularCard
import com.samuelokello.practiceone.presentation.components.ExperienceCard
import com.samuelokello.practiceone.presentation.components.HomeTitle
import com.samuelokello.practiceone.presentation.components.HomeTitleTwo
import com.samuelokello.practiceone.presentation.navigation.BottomNavigationItem

@Suppress("ktlint:standard:function-naming")
@Composable
fun HomeScreenContent(modifier: Modifier = Modifier) {
    var navigationSelectedItem by rememberSaveable {
        mutableIntStateOf(0)
    }

    val experiences =
        listOf(
            Experience(
                imageRes = R.drawable.experience_image_2,
                titleRes = R.string.experience_title_2,
                locationRes = R.string.experience_location_2,
            ),
            Experience(
                imageRes = R.drawable.experience_image_1,
                titleRes = R.string.experience_title_1,
                locationRes = R.string.experience_location_1,
            ),
        )

    val preferences =
        listOf(
            Preference(
                icon = R.drawable.icon_1,
                name = R.string.preference_name_1,
            ),
            Preference(
                icon = R.drawable.icon_2,
                name = R.string.preference_name_2,
            ),
            Preference(
                icon = R.drawable.icon_3,
                name = R.string.preference_name_3,
            ),
            Preference(
                icon = R.drawable.icon_4,
                name = R.string.preference_name_4,
            ),
        )

    val categories =
        listOf(
            Category(title = R.string.experience),
            Category(title = R.string.activities),
            Category(title = R.string.adventures),
        )

    Scaffold(
        topBar = {
            AppBAr(
                Image = R.drawable.profile_picture,
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
            ) {
                BottomNavigationItem().bottomNavigationItems().forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = index == navigationSelectedItem,
                        onClick = {
                        },
                        icon = { Icon(item.icon, contentDescription = null) },
                    )
                }
            }
        },
    ) { innerPadding ->
        Column(
            modifier =
                Modifier.padding(innerPadding)
                    .padding(horizontal = 8.dp),
        ) {
            HomeTitle()
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow {
                items(categories) { category ->
                    CategoryCard(category = category)
                    Spacer(modifier = Modifier.padding(8.dp))
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow {
                items(experiences) { experience ->
                    ExperienceCard(experience = experience)
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            HomeTitleTwo()
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow {
                items(preferences) { preference ->
                    CircularCard(preference = preference)
                    Spacer(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
                }
            }
        }
    }
}
