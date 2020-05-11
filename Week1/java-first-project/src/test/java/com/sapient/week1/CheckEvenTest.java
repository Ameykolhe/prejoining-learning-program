package com.sapient.week1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class CheckEvenTest {

    @Test
    public void testEvenNumber() {
        Integer num = 10;
        assertTrue(CheckEven.check(num));
    }


    @Test
    public void testOddNumber() {
        Integer num = 21;
        assertFalse(CheckEven.check(num));
    }


    @Test
    public void testEvenNumber2() {
        Integer num = -2;
        assertTrue(CheckEven.check(num));
    }


    @Test
    public void testOddNumber2() {
        Integer num = -37;
        assertFalse(CheckEven.check(num));
    }


    @Test
    public void testNumber() {
        Integer num = 0;
        assertTrue(CheckEven.check(num));
    }
}