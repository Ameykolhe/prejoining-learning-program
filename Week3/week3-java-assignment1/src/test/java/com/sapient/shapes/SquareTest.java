package com.sapient.shapes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {

    @Test
    public void test1() {
        Square square = new Square(10);
        int area = square.calculateArea();
        assertEquals(100, area);
    }

    @Test
    public void test2() {
        Square square = new Square(5);
        int area = square.calculateArea();
        assertEquals(25, area);
    }
}