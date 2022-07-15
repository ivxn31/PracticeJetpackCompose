package com.example.compose.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.compose.ui.antonio_leiva.WrapperApp
import com.example.compose.ui.jettipcalculator.MainContent
import com.example.compose.ui.jettipcalculator.TopHeader

class JetTipCalculatorActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    //TopHeader()
                    MainContent()
                }
            }
        }
    }
}