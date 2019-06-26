package com.example.espressoexample;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.espressoexample", appContext.getPackageName());
    }
    @Test
    public void userAbleToEnterFirstName(){
        Espresso.onView(withId(R.id.firstName)).perform(typeText("NAncy"));
    }
    @Test
    public void checkIfFirstNAmeIsValid(){
        assertFalse(MainActivity.isValidName("name@email"));
    }
    @Test
    public void checkIfLastNAmeIsValid(){
        assertTrue(MainActivity.isValidName("namemail"));
    }
}
