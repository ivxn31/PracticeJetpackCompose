package com.example.compose.ui.antonio_leiva

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@ExperimentalFoundationApi
@Composable
fun MainScreen(navController: NavController){
    Scaffold(
        topBar = { MainAppBar() }
    ) {
        MediaItemList(navController,Modifier.padding(it))
    }
}