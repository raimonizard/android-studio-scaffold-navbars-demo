package com.example.android_studio_scaffold.view

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.android_studio_scaffold.nav.Routes
import com.example.android_studio_scaffold.viewmodel.ScaffoldViewModel

@Composable
fun MyAppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Home.route // Definim la pantalla inicial
    ) {
        composable(Routes.Home.route) { HomeScreen() }
        composable(Routes.Favorite.route) { FavoriteScreen() }
        composable(Routes.Settings.route) { SettingsScreen() }
        composable(Routes.Search.route) { SearchScreen() }
        composable(Routes.Add.route) { AddScreen() }
    }
}
