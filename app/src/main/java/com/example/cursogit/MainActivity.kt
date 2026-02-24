package com.example.cursogit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.cursogit.ui.CalculatorScreen
import com.example.cursogit.ui.CalculatorViewModel
import com.example.cursogit.ui.theme.CursoGitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CursoGitTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CalculatorScreen(
                        state = state,
                        modifier = Modifier.padding(innerPadding),
                        onAction = viewModel::onAction
                    )
                }
            }
        }
    }
}
