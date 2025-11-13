package com.pedro.gestaoresiduos.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pedro.gestaoresiduos.databinding.ActivityHomeBinding
import com.pedro.gestaoresiduos.ui.calendario.CalendarioActivity
import com.pedro.gestaoresiduos.ui.educativo.EducativoActivity
import com.pedro.gestaoresiduos.ui.mapa.MapaActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var b: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnCalendario.setOnClickListener { startActivity(Intent(this, CalendarioActivity::class.java)) }
        b.btnMapa.setOnClickListener { startActivity(Intent(this, MapaActivity::class.java)) }
        b.btnEducativo.setOnClickListener { startActivity(Intent(this, EducativoActivity::class.java)) }
    }
}
