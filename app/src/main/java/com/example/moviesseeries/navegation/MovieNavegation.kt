package com.example.moviesseeries.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.moviesseeries.screens.details.DetailsScreens
import com.example.moviesseeries.screens.home.HomeScreen


@Composable
fun MovieNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = MovieScreens.HomeScreen.name ){
        composable(MovieScreens.HomeScreen.name){
            HomeScreen(navController = navController)
        }
        composable(MovieScreens.DetailsScreen.name+"/{movie}",
            arguments = listOf(navArgument(name = "movie"){type = NavType.StringType}))
        {
            backStackEntry ->
            DetailsScreens(navController = navController,
                backStackEntry.arguments?.getString("movie"))
        }
    }
}