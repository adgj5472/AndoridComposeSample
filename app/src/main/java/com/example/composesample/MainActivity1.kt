package com.example.composesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composesample.ui1.theme.ComposeSampleTheme

class MainActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SpotiSearchScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        color = Color.Blue)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeSampleTheme {
        Greeting("Android")
    }
}

@Composable
fun SpotiSearchScreen() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Search",
            color = Color.White,
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Black
        )


        Box { /* TODO  SearchBar() */ }

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Your top generes", color = Color.White, fontWeight = FontWeight.Bold)

        Box { /* TODO  Blocks() */ }

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Browse all", color = Color.White, fontWeight = FontWeight.Bold)

        Box {  /* TODO  Blocks() */ }
    }
}


@Preview(
    showBackground = true,
    name = "Spoti search screen",
    backgroundColor = 0xFF191414
)
@Composable
fun PreviewSpotiHomeScreen() {
    SpotiSearchScreen()
}