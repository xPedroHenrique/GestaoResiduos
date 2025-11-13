package com.pedro.gestaoresiduos

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.pedro.gestaoresiduos.ui.login.LoginActivity

@RunWith(AndroidJUnit4::class)
class LoginUiTest {

    @get:Rule
    val rule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun loginValido_navegaParaHome() {
        // Digita o e-mail e a senha
        onView(withId(R.id.etEmail))
            .perform(typeText("teste@exemplo.com"), closeSoftKeyboard())

        onView(withId(R.id.etSenha))
            .perform(typeText("1234"), closeSoftKeyboard())

        // Clica no botão Entrar
        onView(withId(R.id.btnEntrar))
            .perform(click())

        // Verifica se a tela Home foi aberta (botão Calendário visível)
        onView(withId(R.id.btnCalendario)).check(matches(isDisplayed()))
    }
}
