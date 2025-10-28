package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteDeComposeTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Aplicacion()
                }
            }
        }
    }
}

@Composable
fun Aplicacion(){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Cuadrante(
                titulo = stringResource(R.string.primer_titulo),
                descripcion = stringResource(R.string.primera_descripcion),
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Cuadrante(
                titulo = stringResource(R.string.segundo_titulo),
                descripcion = stringResource(R.string.segunda_descipcion),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Cuadrante(
                titulo = stringResource(R.string.tercer_titulo),
                descripcion = stringResource(R.string.tercera_descripcion),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Cuadrante(
                titulo = stringResource(R.string.cuarto_titulo),
                descripcion = stringResource(R.string.cuarta_descripcion),
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun Cuadrante(titulo: String, descripcion: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text (
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text (
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteDeComposeTheme {
        Aplicacion()
    }
}