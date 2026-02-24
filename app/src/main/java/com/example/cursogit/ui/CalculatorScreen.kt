package com.example.cursogit.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorScreen(modifier: Modifier = Modifier) {
    val buttonSpacing = 8.dp

    Box(modifier = modifier
        .fillMaxSize()
        .background(Color.Black)
        .padding(buttonSpacing)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            // Display
            Text(
                text = "0",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp, horizontal = 8.dp),
                textAlign = TextAlign.End,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 1
            )

            // Buttons
            Row(horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol = "AC", modifier = Modifier.weight(1f), color = Color.Gray)
                CalculatorButton(symbol = "+/-", modifier = Modifier.weight(1f), color = Color.Gray)
                CalculatorButton(symbol = "%", modifier = Modifier.weight(1f), color = Color.Gray)
                CalculatorButton(symbol = "/", modifier = Modifier.weight(1f), color = Color(0xFFFFA500)) // Orange
            }
            Row(horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol = "7", modifier = Modifier.weight(1f))
                CalculatorButton(symbol = "8", modifier = Modifier.weight(1f))
                CalculatorButton(symbol = "9", modifier = Modifier.weight(1f))
                CalculatorButton(symbol = "x", modifier = Modifier.weight(1f), color = Color(0xFFFFA500))
            }
            Row(horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol = "4", modifier = Modifier.weight(1f))
                CalculatorButton(symbol = "5", modifier = Modifier.weight(1f))
                CalculatorButton(symbol = "6", modifier = Modifier.weight(1f))
                CalculatorButton(symbol = "-", modifier = Modifier.weight(1f), color = Color(0xFFFFA500))
            }
             Row(horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol = "1", modifier = Modifier.weight(1f))
                CalculatorButton(symbol = "2", modifier = Modifier.weight(1f))
                CalculatorButton(symbol = "3", modifier = Modifier.weight(1f))
                CalculatorButton(symbol = "+", modifier = Modifier.weight(1f), color = Color(0xFFFFA500))
            }
            Row(horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol = "0", modifier = Modifier.weight(2f))
                CalculatorButton(symbol = ".", modifier = Modifier.weight(1f))
                CalculatorButton(symbol = "=", modifier = Modifier.weight(1f), color = Color(0xFFFFA500))
            }
        }
    }
}

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier = Modifier,
    color: Color = Color(0xFF333333) // Dark Gray
) {
    Button(
        onClick = { /* No-op */ },
        modifier = modifier
            .clip(CircleShape)
            .aspectRatio(if (symbol == "0") 2f else 1f),
        colors = ButtonDefaults.buttonColors(containerColor = color)
    ) {
        Text(text = symbol, fontSize = 36.sp, color = Color.White)
    }
}
