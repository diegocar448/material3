package br.com.diegocar.buscadordecep.ui.theme.componentes

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import br.com.diegocar.buscadordecep.ui.theme.Teal700
import br.com.diegocar.buscadordecep.ui.theme.WHITE

@Composable
fun Botao(
    onClick: () -> Unit,
    texto: String,
    modifier: Modifier = Modifier
){
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Teal700
        ),
        modifier = modifier
    ) {
        Text(
            text = texto,
            fontSize = 18.sp,
            color = WHITE,
            fontWeight = FontWeight.Bold
        )
    }
}