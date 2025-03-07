package com.example.android_studio_scaffold.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.android_studio_scaffold.viewmodel.ScaffoldViewModel

@Composable
fun ScaffoldView(myViewModel: ScaffoldViewModel, navController: NavHostController){
    Scaffold (
        topBar = { MyTopAppBar(navController) },
        bottomBar = { MyBottomBar(myViewModel, navController) }
    )
    { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ){
            MyAppNavHost(navController)
        }
    }
}