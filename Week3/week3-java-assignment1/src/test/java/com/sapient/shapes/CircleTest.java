package com.sapient.shapes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {

    @Test
    public void test1() {
        Circle circle = new Circle(10);
        float area = circle.calculateArea();
        assertEquals(314.0f, area);
    }

    @Test
    public void test2() {
        Circle circle = new Circle(5);
        float area = circle.calculateArea();
        assertEquals(78.5f, area);
    }
}