package com.example.compose.ui.antonio_leiva

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun DetailMediaItem(mediaItem: Int){
    val item = remember{ getMedia().first { it.id == mediaItem } }
    Scaffold(
        topBar =  {
            TopAppBar(title = { Text(text = item.title) })
        }
    ){

    }
    /*Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Detail Media Item $mediaItem",
            style = MaterialTheme.typography.h4
        )
    }*/
}