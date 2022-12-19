package com.example.lab2;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.lab2", appContext.getPackageName());
    }
    Context context = null;

    @Test (expected = NullPointerException.class)
    public void Give_NullString_When_removeExcessiveSpacesFromStringIsCalled_Then_NullPointerExceptionIsThrown() {
        Utils.removeExessiveSpacesFromString(null);
    }
    @Test
    public void Given_EmptyString_When_removeExessiveSpacesFromStringIsCalled_Then_ReturnedEmptyString(){
        final String givenString = "";

        final String expectedResult = "";
        final String actualResult = Utils.removeExessiveSpacesFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_StringOFMultipleEmptySpaces_When_removeExcessiveSpacesFromStringIsCalled_Then_EmptyStringIsReturned(){
        final String givenString = "";

        final String expectedResult = "";
        final String actualResult = Utils.removeExessiveSpacesFromString(givenString);

        assertEquals(expectedResult, actualResult);
    }
}