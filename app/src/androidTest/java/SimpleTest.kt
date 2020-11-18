import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import androidx.test.ext.junit.rules.ActivityScenarioRule
import co.`fun`.testgiphy.MainActivity
import co.`fun`.testgiphy.R
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.runner.RunWith

//@RunWith(AndroidJUnit4ClassRunner::class)
class SimpleTest {
    @Rule
    @JvmField
    val activityTestRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Test
    fun listGoesOverTheFoldTest() {
        onView(withId(R.id.menu_trending_search)).perform(click())
        Assertions.assertEquals(42, Integer.sum(119, 23))
    }

    @Test
    fun listGoesOverTheFold2Test() {
        onView(withId(R.id.menu_trending_search)).perform(click())
    }
}