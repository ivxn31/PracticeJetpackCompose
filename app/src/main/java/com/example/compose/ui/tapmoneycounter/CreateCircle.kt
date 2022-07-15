package com.example.compose.ui.tapmoneycounter

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CreateCircle(moneyCounter:Int = 0, updateMoneyCounter:(Int) -> Unit){

    Card(modifier = Modifier
        .padding(3.dp)
        .size(105.dp)
        .clickable { updateMoneyCounter(moneyCounter + 1) },
        shape = CircleShape,
        elevation = 4.dp
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(text = "Tap",
                modifier = Modifier)
        }
    }
}