package com.example.jetpackcomposetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetest.ui.theme.JetpackComposeTestTheme

class MainActivity : ComponentActivity() {
    private val a = ""
    private val c = mutableStateOf(a)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetpackComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        val mContext = LocalContext.current
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(12.dp, 36.dp)
        ){
            Text(text=c.value, fontSize = 24.sp)
            Row {
                Button(onClick = {c.value = c.value + "1"},
                    modifier = Modifier.padding(4.dp, 4.dp)) {
                    Text(text = "1")
                }
                Button(onClick = {c.value = c.value + "2"},
                    modifier = Modifier.padding(4.dp, 4.dp)) {
                    Text(text = "2")
                }
                Button(onClick = {c.value = c.value + "3"},
                    modifier = Modifier.padding(4.dp, 4.dp)) {
                    Text(text = "3")
                }
            }
            Row {
                Button(onClick = {c.value = c.value + "4"},
                    modifier = Modifier.padding(4.dp, 4.dp)) {
                    Text(text = "4")
                }
                Button(onClick = {c.value = c.value + "5"},
                    modifier = Modifier.padding(4.dp, 4.dp)) {
                    Text(text = "5")
                }
                Button(onClick = {c.value = c.value + "6"},
                    modifier = Modifier.padding(4.dp, 4.dp)) {
                    Text(text = "6")
                }
            }
            Row {
                Button(onClick = {c.value = c.value + "7"},
                    modifier = Modifier.padding(4.dp, 4.dp)) {
                    Text(text = "7")
                }
                Button(onClick = {c.value = c.value + "8"},
                    modifier = Modifier.padding(4.dp, 4.dp)) {
                    Text(text = "8")
                }
                Button(onClick = {c.value = c.value + "9"},
                    modifier = Modifier.padding(4.dp, 4.dp)) {
                    Text(text = "9")
                }
            }
            Button(onClick = {c.value = c.value + "0"},
                modifier = Modifier
                    .padding(4.dp, 4.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(text = "0")
            }
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    JetpackComposeTestTheme {
//        Greeting("Android")
//    }
//}