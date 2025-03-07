package com.example.android_studio_scaffold

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.android_studio_scaffold.ui.theme.AndroidstudioscaffoldTheme
import com.example.android_studio_scaffold.view.ScaffoldView
import com.example.android_studio_scaffold.viewmodel.ScaffoldViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val myViewModel by viewModels<ScaffoldViewModel>()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidstudioscaffoldTheme {
                val navController = rememberNavController() // Inicialitza el NavController

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        ScaffoldView(myViewModel, navController, innerPadding)
                    }
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidstudioscaffoldTheme {
        TODO()
    }
}