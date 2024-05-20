package br.com.diegocar.buscadordecep.ui.theme.componentes

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.diegocar.buscadordecep.ui.theme.Teal700
import br.com.diegocar.buscadordecep.ui.theme.WHITE


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaixaTexto(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(text = label)
        },
        colors = TextFieldDefaults.colors(
            focusedLabelColor = Teal700,
            cursorColor = Teal700,
            focusedIndicatorColor = Teal700,
            focusedContainerColor = WHITE,
            unfocusedContainerColor = WHITE
        ),
        modifier = modifier,
        keyboardOptions = keyboardOptions,
        maxLines = 1
    )
}