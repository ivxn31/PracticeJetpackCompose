package com.example.compose.ui.antonio_leiva

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.example.compose.R

@Composable
fun MainAppBar(){
    TopAppBar(
        title =  {
            /** Alternativa simple*/
            /** Alternativa simple*/
            Text(text = stringResource(id = R.string.app_name))

            /** Alternativa un poco mas compleja*/

            /** Alternativa un poco mas compleja*/
            /*Row{
                Text(text = stringResource(id = R.string.app_name))
                Spacer(Modifier.padding(16.dp))
                Icon(Icons.Default.Android,contentDescription = null)
            }*/
        },
        navigationIcon = {
            /*IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = null)
            }*/
        },
        actions = {
            /*IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Search,contentDescription = null)
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Share,contentDescription = null)
            }*/
            AppBarAction(imageVector = Icons.Default.Search) {}
            AppBarAction(imageVector = Icons.Default.Share) {}
        }
    )
}

@Composable
fun AppBarAction(imageVector: ImageVector, onClick:()->Unit){
    IconButton(onClick = onClick) {
        Icon(imageVector = imageVector,contentDescription = null)
    }
}