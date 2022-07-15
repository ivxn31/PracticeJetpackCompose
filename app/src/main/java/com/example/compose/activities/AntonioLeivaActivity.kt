package com.example.compose.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.compose.ui.antonio_leiva.DetailMediaItem
import com.example.compose.ui.antonio_leiva.MainScreen
import com.example.compose.ui.antonio_leiva.WrapperApp

@ExperimentalFoundationApi
class AntonioLeivaActivity:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WrapperApp{
                /*
                //var text by rememberSaveable{ mutableStateOf("") }
                val (value,onValueChange) = rememberSaveable{ mutableStateOf("") }
                StateSample(
                    value = value,
                    onValueChange = onValueChange
                )*/
                /*Scaffold(
                    topBar = { MainAppBar() }
                ) {
                    MediaItemList(Modifier.padding(it))
                }*/

                val navController = rememberNavController()
                //
                NavHost(navController = navController, startDestination = "main"){
                    composable("main"){
                        MainScreen(navController)
                    }

                    composable(
                        route = "detail/{mediaItem}",
                        arguments = listOf(
                            navArgument("mediaItem") { type = NavType.IntType }
                        )
                    ){
                        val id = it.arguments?.getInt("mediaItem")
                        requireNotNull(id) { "No debe ser nulo porque es obligaorio recibir un objeto de tipo MediaItem" }
                        DetailMediaItem(id)
                    }
                }
            }
        }
    }
}