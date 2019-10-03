package io.github.gianpamx.calculator


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(androidx.test.ext.junit.runners.AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun allButtonsAreConnected() {
        val textView = onView(withId(R.id.resultTextView))

        onView(withId(R.id.button1)).perform(click())
        onView(withId(R.id.button2)).perform(click())
        onView(withId(R.id.button3)).perform(click())
        onView(withId(R.id.button4)).perform(click())
        onView(withId(R.id.buttonPlus)).perform(click())
        onView(withId(R.id.button5)).perform(click())
        onView(withId(R.id.button6)).perform(click())
        onView(withId(R.id.button7)).perform(click())
        onView(withId(R.id.button8)).perform(click())
        onView(withId(R.id.button9)).perform(click())
        onView(withId(R.id.buttonEqual)).perform(click())

        textView.check(matches(withText("58023")))
    }

    @Test
    fun minusButtonIsConnected() {
        val textView = onView(withId(R.id.resultTextView))

        onView(withId(R.id.button5)).perform(click())
        onView(withId(R.id.buttonMinus)).perform(click())
        onView(withId(R.id.button1)).perform(click())
        onView(withId(R.id.buttonEqual)).perform(click())

        textView.check(matches(withText("4")))
    }
}
