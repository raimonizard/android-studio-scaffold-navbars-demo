package com.example.android_studio_scaffold.nav

sealed class Routes(val route: String) {
    object Home : Routes("home")
    object Favorite : Routes("favorite")
    object Settings : Routes("settings")
}