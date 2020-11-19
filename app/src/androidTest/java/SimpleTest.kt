import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import co.`fun`.testgiphy.MainActivity
import co.`fun`.testgiphy.R
import io.qameta.allure.android.runners.AllureAndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.runner.RunWith

@RunWith(AllureAndroidJUnit4::class)
class SimpleTest {
    @Rule
    @JvmField
    var activityActivityTestRule = ActivityScenarioRule(MainActivity::class.java)

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