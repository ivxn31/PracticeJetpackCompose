package com.example.compose.ui.antonio_leiva

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.compose.R

@ExperimentalFoundationApi
@Composable
fun MediaItemList(navController: NavController, modifier: Modifier = Modifier){
    LazyVerticalGrid(
        contentPadding = PaddingValues(2.dp),
        cells = GridCells.Adaptive(150.dp),
        modifier = modifier
    ){
        items(getMedia()){ item ->
            MediaListItem(item,navController,Modifier.padding(2.dp))
        }
    }
}

@Composable
fun MediaListItem(item:MediaItem,navController:NavController, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .clickable { navController.navigate("detail/${item.id}") }
    ){
        Box(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            val imageRemote = item.thumb
            //val painter = rememberAsyncImagePainter("")
            /*Image(painter = rememberImagePainter(
                data = imageRemote),
                contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)*/
            AsyncImage(
                model = imageRemote,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            if(item.type == MediaItem.TypeMedia.VIDEO){
                /** Desde libreria material-icons-extended*/
                /*Icon(imageVector = Icons.Default.PlayCircleOutline,
                    contentDescription = null,
                    modifier = Modifier.size(92.dp),
                    tint = Color.White)*/
                /** Desde drawable*/
                Icon(painter = painterResource(id = R.drawable.ic_play_circle_outline_24),
                    contentDescription = null,
                    modifier = Modifier.size(92.dp),
                    tint = Color.White)
            }
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.secondary)
                .padding(16.dp)
        ){
            Text(
                text = item.title,
                style = MaterialTheme.typography.h6)
        }
    }
}