package com.pedro.gestaoresiduos

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.pedro.gestaoresiduos.ui.login.LoginActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FluxoCompletoUiTest {

    @get:Rule
    val rule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun fluxoCompleto_loginENavegaParaHome() {
        // Digita e-mail e senha válidos
        onView(withId(R.id.etEmail)).perform(typeText("teste@exemplo.com"), closeSoftKeyboard())
        onView(withId(R.id.etSenha)).perform(typeText("1234"), closeSoftKeyboard())

        // Clica em "Entrar"
        onView(withId(R.id.btnEntrar)).perform(click())

        // Verifica se chegou na tela Home
        onView(withText("Calendário")).check(matches(isDisplayed()))
        onView(withText("Mapa")).check(matches(isDisplayed()))
        onView(withText("Educação")).check(matches(isDisplayed()))
    }
}
