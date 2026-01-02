package dev.yashrajmtiwari.android

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleApp()
        }
    }
}

@Composable
fun SimpleApp() {
    var count by remember { mutableIntStateOf(0) }
    var name by remember { mutableStateOf("") }
    CounterUI(count = count, onIncrease = { count++ }, onReset = { count = 0 }, onDecrease = { if (count != 0) {count--} }, onMultiply = { count *= 2})
}

@Preview(showBackground = true)
@Composable
fun SimpleAppPreview() {
    SimpleApp()
}
