package com.yg.aethervoyager

import com.yg.networkengine.NativeLib

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yg.aethervoyager.ui.theme.AetherVoyagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AetherVoyagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NativeTest(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun NativeTest(modifier: Modifier = Modifier){
    var result by remember { mutableStateOf(0) }

    Column(modifier = modifier.padding(16.dp)) {
        Text(text = "Result: $result")

        Button(onClick = {
            result = NativeLib().add(2, 3)
        }) {
            Text("Calls native add")
        }
    }
}