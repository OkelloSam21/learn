package com.samuelokello.practiceone.presentation.navigation

sealed class Screens(val route : String) {
    object Home : Screens("home_route")
    object Message : Screens("message_route")
    object Like : Screens("Like_route")
    object Search : Screens("search_route")
}