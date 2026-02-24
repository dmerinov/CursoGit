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
fun CalculatorScreen(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    onAction: (CalculatorAction) -> Unit
) {
    val buttonSpacing = 8.dp

    Box(
        modifier = modifier
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
                text = state.display,
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
                CalculatorButton(symbol = "AC", modifier = Modifier.weight(1f), color = Color.Gray) { onAction(CalculatorAction.Clear) }
                CalculatorButton(symbol = "Del", modifier = Modifier.weight(1f), color = Color.Gray) { onAction(CalculatorAction.Delete) }
                CalculatorButton(symbol = "/", modifier = Modifier.weight(1f), color = Color(0xFFFFA500)) { onAction(CalculatorAction.Operation(CalculatorOperation.Divide)) }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol = "7", modifier = Modifier.weight(1f)) { onAction(CalculatorAction.Number(7)) }
                CalculatorButton(symbol = "8", modifier = Modifier.weight(1f)) { onAction(CalculatorAction.Number(8)) }
                CalculatorButton(symbol = "9", modifier = Modifier.weight(1f)) { onAction(CalculatorAction.Number(9)) }
                CalculatorButton(symbol = "x", modifier = Modifier.weight(1f), color = Color(0xFFFFA500)) { onAction(CalculatorAction.Operation(CalculatorOperation.Multiply)) }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol = "4", modifier = Modifier.weight(1f)) { onAction(CalculatorAction.Number(4)) }
                CalculatorButton(symbol = "5", modifier = Modifier.weight(1f)) { onAction(CalculatorAction.Number(5)) }
                CalculatorButton(symbol = "6", modifier = Modifier.weight(1f)) { onAction(CalculatorAction.Number(6)) }
                CalculatorButton(symbol = "-", modifier = Modifier.weight(1f), color = Color(0xFFFFA500)) { onAction(CalculatorAction.Operation(CalculatorOperation.Subtract)) }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol = "1", modifier = Modifier.weight(1f)) { onAction(CalculatorAction.Number(1)) }
                CalculatorButton(symbol = "2", modifier = Modifier.weight(1f)) { onAction(CalculatorAction.Number(2)) }
                CalculatorButton(symbol = "3", modifier = Modifier.weight(1f)) { onAction(CalculatorAction.Number(3)) }
                CalculatorButton(symbol = "+", modifier = Modifier.weight(1f), color = Color(0xFFFFA500)) { onAction(CalculatorAction.Operation(CalculatorOperation.Add)) }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol = "0", modifier = Modifier.weight(2f)) { onAction(CalculatorAction.Number(0)) }
                CalculatorButton(symbol = ".", modifier = Modifier.weight(1f)) { onAction(CalculatorAction.Decimal) }
                CalculatorButton(symbol = "=", modifier = Modifier.weight(1f), color = Color(0xFFFFA500)) { onAction(CalculatorAction.Calculate) }
            }
        }
    }
}

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier = Modifier,
    color: Color = Color(0xFF333333), // Dark Gray
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .clip(CircleShape)
            .aspectRatio(if (symbol == "0") 2f else 1f),
        colors = ButtonDefaults.buttonColors(containerColor = color)
    ) {
        Text(text = symbol, fontSize = 36.sp, color = Color.White)
    }
}
