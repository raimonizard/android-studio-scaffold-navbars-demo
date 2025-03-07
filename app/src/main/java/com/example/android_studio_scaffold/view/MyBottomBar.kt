package com.example.android_studio_scaffold.view

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
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
) {
    val bottomNavigationItems by myViewModel.bottomNavigationItems.observeAsState(emptyList())

    NavigationBar(containerColor = Color.LightGray, contentColor = Color.Black) {
        val navBackEntry by navigationController.currentBackStackEntryAsState()
        val currentRoute = navBackEntry?.destination?.route

        bottomNavigationItems.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) }, // ← correcció de `contentDescription`
                label = { Text(item.label) },
                selected = currentRoute == item.route,
                onClick = {
                    if (currentRoute != item.route) {
                        navigationController.navigate(item.route)
                    }
                }
            )
        }
    }
}
