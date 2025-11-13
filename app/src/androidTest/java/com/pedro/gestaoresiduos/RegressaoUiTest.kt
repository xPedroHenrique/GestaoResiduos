package com.pedro.gestaoresiduos

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.pedro.gestaoresiduos.ui.login.LoginActivity
import org.hamcrest.CoreMatchers.containsString
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RegressaoUiTest {

    @get:Rule
    val rule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun verificarFluxoAposMudancas() {
        // Faz login
        onView(withId(R.id.etEmail)).perform(typeText("teste@exemplo.com"), closeSoftKeyboard())
        onView(withId(R.id.etSenha)).perform(typeText("1234"), closeSoftKeyboard())
        onView(withId(R.id.btnEntrar)).perform(click())

        onView(withText("Calendário")).check(matches(isDisplayed()))
        onView(withId(R.id.btnEducativo)).perform(click())
        onView(withText(containsString("Tijucas"))).check(matches(isDisplayed()))
    }
}
