package com.example.android_studio_scaffold.view

import androidx.compose.material3.Icon
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.android_studio_scaffold.viewmodel.ScaffoldViewModel

@Composable
fun MyBottomBar(
    myViewModel: ScaffoldViewModel,
    navigationController: NavHostController
){
    val bottomNavigationItems by myViewModel.bottomNavigationItems.observeAsState(emptyList())

    BottomNavigation(backgroundColor = Color.Red){
        val navBackEntry by navigationController.currentBackStackEntryAsState()
        val currentRoute = navBackEntry?.destination?.route

        bottomNavigationItems.forEach{ item ->
            BottomNavigationItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = currentRoute == item.route,
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Black,
                alwaysShowLabel = false,
                onClick = {
                    if (currentRoute != item.route) {
                        navigationController.navigate(item.route)
                    }
                }
            )
        }
    }
}

