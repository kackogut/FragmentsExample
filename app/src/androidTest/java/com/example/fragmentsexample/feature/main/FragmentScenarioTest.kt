package com.example.fragmentsexample.feature.main


import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.example.fragmentsexample.R
import com.example.fragmentsexample.data.FragmentService
import com.example.fragmentsexample.feature.common.BaseFragment
import com.example.fragmentsexample.feature.common.BaseFragmentFactory
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class FragmentScenarioTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    val fragmentService = FragmentService()

    @Test
    fun mainActivityTest2() {
        val scenario = launchFragmentInContainer<BaseFragment>(factory = BaseFragmentFactory(fragmentService))
        assert(fragmentService.fragmentsCount == 1)

        scenario.recreate()

        assert(fragmentService.fragmentsCount == 1)
    }


}
