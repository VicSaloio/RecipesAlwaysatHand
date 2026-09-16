package br.com.fiap.alwaysathand.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.alwaysathand.ui.theme.RecipesAlwaysAtHandTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Scaffold(
            topBar = {},
            bottomBar = {},
            floatingActionButton = {}
        ){ paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
            ) { }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    RecipesAlwaysAtHandTheme() {
        HomeScreen()
    }
}