package thaisa.vitoria.app_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import thaisa.vitoria.app_imc.ui.theme.APPIMCTheme

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
    var peso by remember { mutableStateOf(value = "") }
    var imc by remember { mutableStateOf(value = "") }

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
        ) {
            Text(text = "Altura")
            OutlinedTextField(
                value = altura,
                onValueChange = { altura = it },
                modifier = Modifier.fillMaxWidth()
            )

            Text(text = "Peso")
            OutlinedTextField(
                value = peso,
                onValueChange = { peso = it },
                modifier = Modifier.fillMaxWidth()
            )

            Button(onClick = {}) {
                Text(text = "Calcular")
            }

            Text(
                text = imc,
                fontSize = 25.sp,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TelaInicialPreview() {
    APPIMCTheme {
        TelaInicial()
    }
}