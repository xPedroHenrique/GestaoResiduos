package com.pedro.gestaoresiduos.data.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pedro.gestaoresiduos.data.model.Coleta

class ColetaRepository {
    private val _coletas = MutableLiveData(
        listOf(
            Coleta("Segunda-Feira", "Orgânicos", "Centro"),
            Coleta("Terça-Feira", "Recicláveis", "Universitário"),
            Coleta("Quarta-Feira", "Orgânicos", "Praça"),
            Coleta("Quinta-Feira", "Recicláveis", "Joáia"),
            Coleta("Sexta-Feira", "Eletrônicos", "Mata Atlântica")
        )
    )
    val coletas: LiveData<List<Coleta>> = _coletas
}
