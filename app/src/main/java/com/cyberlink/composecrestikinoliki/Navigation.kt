package com.cyberlink.composecrestikinoliki

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigator() {

    val navigat = rememberNavController()

    NavHost(navController = navigat, startDestination = "Menu") {

        composable("Menu") {

            ScreenMenu(navigat)
        }
        composable("Play with friend") {

            MainScreen()
        }

        composable("Play with robbot") {

            PlayRobbot()
        }
    }


}