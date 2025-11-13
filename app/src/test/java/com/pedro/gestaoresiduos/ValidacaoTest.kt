package com.pedro.gestaoresiduos

import com.pedro.gestaoresiduos.util.Validacao
import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test

class ValidacaoTest {

    @Test
    fun validarEmailCorreto() {
        val email = "teste@exemplo.com"
        assertTrue(Validacao.validarEmail(email))
    }

    @Test
    fun validarEmailIncorreto() {
        val email = "teste@exemplo"
        assertFalse(Validacao.validarEmail(email))
    }
}