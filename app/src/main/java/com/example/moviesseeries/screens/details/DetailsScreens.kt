package com.example.moviesseeries.screens.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.moviesseeries.model.Movie
import com.example.moviesseeries.model.getMovies
import com.example.moviesseeries.widgets.MoviewList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreens(navController: NavController,
                   movieId: String?){
    val movie = getMovies().filter { movie ->
        movie.id == movieId
    }
    Scaffold(topBar = {
        TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Magenta,
            titleContentColor = Color.Black
        ), title = {
            Row(horizontalArrangement = Arrangement.Start) {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription ="ArrowBack",
                    modifier = Modifier
                        .clickable {
                            navController.popBackStack()
                        })
                Spacer(modifier = Modifier.width(100.dp))
                Text(text = "Filmes")
                
            }
        })
    }) {  innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)){
            Surface(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()) {
                Column(verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    MoviewList(movie = movie.first())
                    Spacer(modifier = Modifier.height(8.dp))
                    Divider()
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Imagens do filme")
                    HorizontalScrollImage(movie)

                    }
                }

            }

        }

    }

@Composable
private fun HorizontalScrollImage(movie: List<Movie>) {
    LazyRow {
        items(movie[0].images) { image ->
            ElevatedCard(
                modifier = Modifier
                    .padding(12.dp)
                    .size(240.dp)
            ) {
                AsyncImage(
                    model = image, contentDescription = "Movie Posto",
                    placeholder = ColorPainter(Color.Gray),
                    alignment = Alignment.Center,
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .fillMaxWidth()
                )


            }
        }
    }
}
