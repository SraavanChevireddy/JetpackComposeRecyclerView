package com.example.jetpackcomposerecyclerview.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposerecyclerview.R

@Composable
fun RecipeCard(onClick:() -> Unit){
    Card (shape = MaterialTheme .shapes.small,
    modifier = Modifier.padding(bottom = 6.dp, top = 6.dp)
        .fillMaxWidth()
        .clickable(onClick = onClick),
    elevation = 8.dp){
    // Add the actual UI components here
        Column{
            Image(bitmap = imageResource(id = R.drawable.ic_android_black_24dp),
            modifier = Modifier.fillMaxWidth()
                .height(225.dp),
            contentScale = ContentScale.Crop)
        }
        Row {
            Text(text = "This is the value of the code",
            modifier = Modifier.
                fillMaxWidth(0.85f).
                padding(top = 5.dp,bottom = 5.dp,start = 5.dp, end = 5.dp).
                wrapContentWidth(Alignment.Start),
            style = MaterialTheme.typography.h5)
        }
    }
}