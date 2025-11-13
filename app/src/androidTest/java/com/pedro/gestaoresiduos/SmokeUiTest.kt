package com.pedro.gestaoresiduos

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.pedro.gestaoresiduos.ui.login.LoginActivity

@RunWith(AndroidJUnit4::class)
class SmokeUiTest {

    @get:Rule
    val rule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun appInicia_mostraTelaDeLogin() {
        // Verifica se o campo de e-mail está visível
        onView(withId(R.id.etEmail)).check(matches(isDisplayed()))

        // Verifica se o campo de senha está visível
        onView(withId(R.id.etSenha)).check(matches(isDisplayed()))

        // Verifica se o botão de entrar está visível
        onView(withId(R.id.btnEntrar)).check(matches(isDisplayed()))
    }
}
