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
    val context = LocalContext.current
    var name by remember { mutableStateOf("") }
    CounterUI(
        count = count,
        onIncrease = { count++ },
        onReset = { count = 0 },
        onDecrease = {
            if (count != 0) {
                count--
            } else {
                Toast.makeText(context, "Value cannot be less than 0.", Toast.LENGTH_SHORT).show()
            } },
        onMultiply = { if (count != 0) {
            count *= 2
        } else {
            Toast.makeText(context, "Cannot Multiply by zero", Toast.LENGTH_SHORT).show()
        }
        }
    )
    LaunchedEffect(count) {
        if (count == 10) {
            Toast.makeText(context, "Count reached 10!", Toast.LENGTH_SHORT).show()
        } else if (count == 20) {
            Toast.makeText(context, "Count reached 20!", Toast.LENGTH_LONG).show()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SimpleAppPreview() {
    SimpleApp()
}
