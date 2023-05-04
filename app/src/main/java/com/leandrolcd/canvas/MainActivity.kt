package com.leandrolcd.canvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.leandrolcd.canvas.ui.dashboart.SemiCircularGauge
import com.leandrolcd.canvas.ui.model.Values
import com.leandrolcd.canvas.ui.theme.CanvasTheme

@ExperimentalTextApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CanvasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    val value = Values(0f,100f, 50f, "Temp")
                    Box(Modifier.size(200.dp).fillMaxWidth(), contentAlignment = Alignment.Center){
                        SemiCircularGauge(values = value, strokeIndicator = 40f,
                            textColor = Color.Red,
                            indicatorColor = Color.Red)
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CanvasTheme {
        Greeting("Android")
    }
}