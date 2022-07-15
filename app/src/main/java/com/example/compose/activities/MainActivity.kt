package com.example.compose.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.compose.ui.antonio_leiva.DetailMediaItem
import com.example.compose.ui.antonio_leiva.MainScreen
import com.example.compose.ui.antonio_leiva.WrapperApp
import com.example.compose.ui.jetbizcard.CreateBizCard
import com.example.compose.ui.main.ButtonGoToActivity

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ButtonGoToActivity("Curso Antonio Leiva", LocalContext.current,AntonioLeivaActivity())
                        ButtonGoToActivity("Tap Money Counter", LocalContext.current,TapMoneyCounterActivity())
                        ButtonGoToActivity("Jet Biz Card", LocalContext.current,JetBizCardActivity())
                        ButtonGoToActivity("Jet Tip Calculator", LocalContext.current,JetTipCalculatorActivity())
                    }
                }
            }
        }
    }
}