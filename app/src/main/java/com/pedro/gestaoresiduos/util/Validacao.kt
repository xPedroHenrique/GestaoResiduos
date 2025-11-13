package com.pedro.gestaoresiduos.util

object Validacao {
        private val emailRegex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")
        fun validarEmail(email: String): Boolean = emailRegex.matches(email)
}
