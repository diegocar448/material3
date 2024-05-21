package br.com.diegocar.buscadordecep.ui.theme.repositorio

import br.com.diegocar.buscadordecep.ui.theme.datasource.Servidor
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repositorio @Inject constructor(private val servidor: Servidor) {

//    fun valor(): String{
//        return "Diego Cardoso"
//    }

    suspend fun buscarCep(
        cep: String,
        respostaDoServidor: (String, String, String, String) -> Unit,
        messagemErro: (String) -> Unit
    ){
        servidor.buscarCep(cep, respostaDoServidor, messagemErro)
    }
}