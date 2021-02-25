package com.ad.advanced;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringOperationsTest {

    private StringOperations stringOperations;

    @BeforeEach
    public void setUp() throws Exception {
        stringOperations = new StringOperations();
    }

    @AfterEach
    public void tearDown() throws Exception {
        stringOperations = null;
    }

    @Test
    public void concatString_ShouldNotReturnNullResult_WhenInputIsNotNull() { //<method>_Should<expected>_When<condition>
        Assertions.assertNotNull( stringOperations.concatString("Barru", "Maisha") );
    }

    @Test()
    public void concatString_ShouldThrowNullPointerException_WhenInputIsNull() {
        Exception ex = Assertions.assertThrows(NullPointerException.class, () -> stringOperations.concatString("asdasd", null));
        Assertions.assertTrue("String concatenation not possible with null String".equals(ex.getMessage()));
    }


    @Test
    public void verifyStartAndEndStringSame_ShouldReturnTrue_WhenInputHasSameStartAndEndString() { //<method>_Should<expected>_When<condition>
        Assertions.assertTrue(stringOperations.verifyStartAndEndStringSame("abcxxxabc", "abc"));
    }

    @Test
    public void verifyStartAndEndStringSame_ShouldReturnFalse_WhenInputNotHaveSameStartAndEndString() { //<method>_Should<expected>_When<condition>
        Assertions.assertFalse(stringOperations.verifyStartAndEndStringSame("abcxxxabc", "ab"));
    }
}
