package com.samuelokello.openjobs.data.remote.helper

sealed class Endpoint(val route: String) {
    object AllJobs : Endpoint(route = "https://1c9103788998458a8bdd0b440f208987.api.mockbin.io/")
}