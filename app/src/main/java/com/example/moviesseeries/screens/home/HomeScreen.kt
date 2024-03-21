package com.example.moviesseeries.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.moviesseeries.model.Movie
import com.example.moviesseeries.model.getMovies
import com.example.moviesseeries.navegation.MovieScreens
import com.example.moviesseeries.widgets.MoviewList


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Magenta,
            titleContentColor = Color.Black
        ),
            title = { Text(text = "Filmes") })
    }){innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            MainContent(navController = navController)

        }

    }
}

@Composable
fun MainContent(
    navController: NavController,
    movieList: List<Movie> = getMovies()){
    LazyColumn{
    items(items = movieList){
        MoviewList(movie = it){ movie ->
            navController.navigate(route = MovieScreens.DetailsScreen.name+"/$movie")
        }

    }
}
}