package com.samuelokello.practiceone.presentation.components

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
import androidx.navigation.compose.rememberNavController
import com.samuelokello.practiceone.presentation.navigation.BottomNavigationItem

@Suppress("UnusedMaterial3ScaffoldPaddingParameter", "ktlint:standard:function-naming")
@Composable
fun BottomNavigationBar(modifier: Modifier = Modifier) {
    var navigationSelectedItem by rememberSaveable {
        mutableIntStateOf(0)
    }

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
            ) {
                BottomNavigationItem().bottomNavigationItems().forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = index == navigationSelectedItem,
                        onClick = {
//                            navigationSelectedItem = index
//                            navController.navigate(item.route) {
//                                popUpTo(navController.graph.findStartDestination().id) {
//                                    saveState = true
//                                }
//                                launchSingleTop = true
//                                restoreState = true
//                            }
                        },
                        icon = { Icon(item.icon, contentDescription = null) },
                    )
                }
            }
        },
        content = {},
    )
}
