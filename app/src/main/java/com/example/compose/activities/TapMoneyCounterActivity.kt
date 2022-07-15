package com.example.compose.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.tapmoneycounter.CreateCircle

class TapMoneyCounterActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                // A surface container using the 'background' color from the theme
                val moneyCounter = remember {
                    mutableStateOf(0)
                }
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    color = Color(0xFF546E7A)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "$${moneyCounter.value}",
                        style = TextStyle(color = Color.White,
                            fontSize = 35.sp,
                            fontWeight = FontWeight.ExtraBold))
                        Spacer(modifier = Modifier
                            .height(130.dp))
                        CreateCircle(moneyCounter = moneyCounter.value){ newValue ->
                            moneyCounter.value = newValue
                        }

                        if (moneyCounter.value > 25){
                            Text(text = "Lots of money")
                        }
                    }
                }
            }
        }
    }
}