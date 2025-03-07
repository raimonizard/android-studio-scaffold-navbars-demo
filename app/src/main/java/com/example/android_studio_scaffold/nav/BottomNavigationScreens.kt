package com.example.android_studio_scaffold.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationScreens(val route: String,
                                    val icon: ImageVector,
                                    val label: String
){
    object Home: BottomNavigationScreens(Routes.Home.route, Icons.Filled.Home, "Inici")
    object Favorite: BottomNavigationScreens(Routes.Favorite.route, Icons.Filled.Favorite, "Preferits")
    object Settings: BottomNavigationScreens(Routes.Settings.route, Icons.Filled.Settings, "Settings")
}