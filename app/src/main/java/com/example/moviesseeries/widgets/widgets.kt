package com.example.moviesseeries.widgets

import android.content.Context
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.example.moviesseeries.model.Movie
import com.example.moviesseeries.model.getMovies
import kotlin.coroutines.coroutineContext


@Composable
fun MoviewList(movie: Movie = getMovies()[0],
               expanded: MutableState<Boolean>,
               onItemClink: (String) -> Unit = {}){
   //var expanded by remember {
        //mutableStateOf(false)
   // }


    ElevatedCard(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        //.height(130.dp)
        .clickable {
            onItemClink(movie.id)
        },
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start){
            Surface(modifier = Modifier
                .padding(12.dp)
                .size(100.dp),
                shape = RectangleShape,
                shadowElevation = 4.dp,
                tonalElevation = 4.dp,){
                AsyncImage(movie.images[0], contentDescription = "Movie Poster",
                    placeholder = ColorPainter(Color.Gray))

            }

            Column(modifier = Modifier.padding(4.dp)) {
                Text(text = movie.title,
                    style = MaterialTheme.typography.titleLarge)
                Text(text = "Lançado: ${movie.year}",
                    style = MaterialTheme.typography.titleSmall)


                AnimatedVisibility(visible = expanded.value) {
                    Column {
                        Text( buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 13.sp)){
                                append("Plot: ")
                            }

                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold)){
                                append(movie.plot)
                            }

                        }, modifier = Modifier.padding(6.dp))
                        
                        Divider(modifier = Modifier.padding(3.dp))
                        Text(text = "Diretor: ${movie.director}", style = MaterialTheme.typography.titleSmall)
                        Text(text = "Ator: ${movie.actors}", style = MaterialTheme.typography.titleSmall)
                        Text(text = "Avaliação: ${movie.rating}", style = MaterialTheme.typography.titleSmall)



                    }

                }



                Icon(imageVector = if (!expanded.value) Icons.Filled.KeyboardArrowDown
                    else Icons.Filled.KeyboardArrowUp,
                    contentDescription = "Dow Arrow",
                    modifier = Modifier
                        .size(25.dp)
                        .clickable {
                            expanded.value = !expanded.value

                        },
                    tint = Color.DarkGray)

            }

        }

    }
}
