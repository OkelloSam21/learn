package com.samuelokello.practiceone.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.Chat
import androidx.compose.material.icons.automirrored.rounded.Message
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Message
import androidx.compose.material.icons.rounded.Search
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
    val icon: ImageVector = Icons.Rounded.Home,
    val route: String = "",
) {
    fun bottomNavigationItems(): List<BottomNavigationItem> {
        return listOf(
            BottomNavigationItem(Icons.Rounded.Home, Screens.Home.route),
            BottomNavigationItem(Icons.AutoMirrored.Rounded.Chat, Screens.Message.route),
            BottomNavigationItem(Icons.Rounded.Favorite, Screens.Like.route),
            BottomNavigationItem(Icons.Rounded.Search, Screens.Search.route),
        )
    }
}
