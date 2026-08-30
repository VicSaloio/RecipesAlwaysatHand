package br.com.fiap.alwaysathand.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.alwaysathand.R
import br.com.fiap.alwaysathand.ui.theme.RecipesAlwaysAtHandTheme
import kotlin.coroutines.coroutineContext

@Composable
fun SignupScreen (modifier: Modifier = Modifier) {
    
}

@Composable
fun TitleComponent (modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.sign_up),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleLarge,
        )
        Text(
            text = stringResource(R.string.create_a_new_account),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleSmall
        )
    }
    
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun TitleComponentPreview() {
    RecipesAlwaysAtHandTheme() {
        TitleComponent()
    }
}