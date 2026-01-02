package dev.yashrajmtiwari.android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CounterUI(
    count: Int,
    onIncrease: () -> Unit,
    onDecrease: () -> Unit,
    onReset: () -> Unit,
    onMultiply: () -> Unit,
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Count: $count")

        Button(onClick = onIncrease) {
            Text("Increase")
        }

        Button(onClick = onDecrease) {
            Text("Decrease")
        }

        Button(onClick = onReset) {
            Text("Reset")
        }

        Button(onClick = onMultiply) {
            Text("Multiply by 2")
        }
    }
}