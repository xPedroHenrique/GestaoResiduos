package com.pedro.gestaoresiduos.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pedro.gestaoresiduos.databinding.ActivityLoginBinding
import com.pedro.gestaoresiduos.ui.home.HomeActivity
import com.pedro.gestaoresiduos.util.Validacao

class LoginActivity : AppCompatActivity() {
    private lateinit var b: ActivityLoginBinding
    private val DEMO_MODE = false // mude para true se quiser liberar sem validar (para a apresentação)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnEntrar.setOnClickListener {
            val email = b.etEmail.text?.toString()?.trim().orEmpty()
            val senha = b.etSenha.text?.toString()?.trim().orEmpty()

            Log.d("LoginActivity", "email='$email' senhaLen=${senha.length}")

            if (DEMO_MODE) {
                navegarParaHome(); return@setOnClickListener
            }

            when {
                email.isEmpty() -> toast("Informe o e-mail.")
                !Validacao.validarEmail(email) -> toast("E-mail inválido.")
                senha.length < 4 -> toast("Senha mínima: 4 caracteres.")
                else -> navegarParaHome()
            }
        }

        b.btnCadastrar.setOnClickListener {
            toast("Cadastro simples concluído!")
        }
    }

    private fun navegarParaHome() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }

    private fun toast(msg: String) =
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

