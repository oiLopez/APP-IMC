package thaisa.vitoria.app_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import thaisa.vitoria.app_imc.ui.theme.APPIMCTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            APPIMCTheme {
                TelaInicial()
            }
        }
    }
}

@Composable
fun TelaInicial() {
    var altura by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Altura")
        OutlinedTextField(
            value = altura,
            onValueChange = { altura = it },
            modifier = Modifier.fillMaxWidth()
        )

        var peso by remember { mutableStateOf(value = "") }
        Text(text = "Peso")
        OutlinedTextField(
            value = peso,
            onValueChange = { peso = it },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TelaInicialPreview() {
    APPIMCTheme {
        TelaInicial()
    }
}