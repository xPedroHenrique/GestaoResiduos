package com.pedro.gestaoresiduos.ui.educativo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pedro.gestaoresiduos.databinding.ActivityEducativoBinding

class EducativoActivity : AppCompatActivity() {
    private lateinit var b: ActivityEducativoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityEducativoBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
}
