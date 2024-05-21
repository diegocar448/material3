package br.com.diegocar.buscadordecep.ui.theme.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.diegocar.buscadordecep.ui.theme.repositorio.Repositorio
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BuscarCepViewModel @Inject constructor(private val repositorio: Repositorio): ViewModel() {

//    val _valor = MutableStateFlow("")
//    val valorAlterado: StateFlow<String> = _valor
//    fun valor(): String{
//        viewModelScope.launch {
//            //aqui recebe o valor que vem do repositorio
//            _valor.value = repositorio.valor()
//        }
//        return valorAlterado.toString()
//    }

//    fun valor(): String{
//        return repositorio.valor()
//    }

    fun buscarCep(
        cep: String,
        respostaDoServidor: (String, String, String, String) -> Unit,
        mensagemErro: (String) -> Unit
    ){
        viewModelScope.launch {
            repositorio.buscarCep(cep, respostaDoServidor, mensagemErro)
        }
    }
}