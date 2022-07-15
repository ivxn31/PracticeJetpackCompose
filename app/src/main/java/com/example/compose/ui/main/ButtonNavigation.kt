package com.example.compose.ui.main

import android.content.Context
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity

@Composable
fun ButtonGoToActivity(btnText:String,context: Context?,activity: ComponentActivity?){
    Button(onClick = {
        goToActivity(context,activity!!)
    }) {
        Text(
            text = btnText,
            style = MaterialTheme.typography.button)
    }
}

fun goToActivity(context: Context?, activity: ComponentActivity?){
    val intent = Intent(context, activity!!::class.java)
    context?.startActivity(intent)
}