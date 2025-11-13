package com.pedro.gestaoresiduos

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.pedro.gestaoresiduos.ui.home.HomeActivity
import org.hamcrest.CoreMatchers.containsString
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeUiTest {

    @get:Rule
    val rule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun navegarParaTelaEducativa() {
        onView(withId(R.id.btnEducativo)).perform(click())
        onView(withText(containsString("Eletrônicos"))).check(matches(isDisplayed()))
    }

    @Test
    fun navegarParaTelaMapa() {
        onView(withId(R.id.btnMapa)).perform(click())
        onView(withId(R.id.tvTituloMapa)).check(matches(isDisplayed()))
    }

}
