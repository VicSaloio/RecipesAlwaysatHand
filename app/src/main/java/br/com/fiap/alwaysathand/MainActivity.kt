package br.com.fiap.alwaysathand

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.fiap.alwaysathand.navigation.NavigationRoutes
import br.com.fiap.alwaysathand.screens.HomeScreen
import br.com.fiap.alwaysathand.screens.InitialScreen
import br.com.fiap.alwaysathand.screens.LoginScreen
import br.com.fiap.alwaysathand.screens.SignupScreen
import br.com.fiap.alwaysathand.ui.theme.RecipesAlwaysAtHandTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecipesAlwaysAtHandTheme {
                NavigationRoutes()
            }
        }
    }
}
