package br.com.diegocar.buscadordecep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.diegocar.buscadordecep.ui.theme.BuscadorDeCepTheme
import br.com.diegocar.buscadordecep.ui.theme.view.BuscarCep

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            val navController: NavHostController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "buscarCep"
            ){
                composable("buscarCep"){
                    BuscarCep(navController = navController)
                }
            }
        }
    }
}

