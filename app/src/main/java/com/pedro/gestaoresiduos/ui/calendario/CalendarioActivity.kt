package com.pedro.gestaoresiduos.ui.calendario

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.pedro.gestaoresiduos.data.repo.ColetaRepository
import com.pedro.gestaoresiduos.databinding.ActivityCalendarioBinding

class CalendarioActivity : AppCompatActivity() {
    private lateinit var b: ActivityCalendarioBinding
    private val repo = ColetaRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityCalendarioBinding.inflate(layoutInflater)
        setContentView(b.root)

        val adapter = ColetaAdapter()
        b.rvColetas.layoutManager = LinearLayoutManager(this)
        b.rvColetas.adapter = adapter

        repo.coletas.observe(this) { lista -> adapter.submit(lista) }
    }
}
