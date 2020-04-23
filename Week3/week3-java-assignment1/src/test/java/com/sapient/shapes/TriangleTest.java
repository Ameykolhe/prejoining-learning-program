package com.sapient.shapes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void test1() {
        Triangle triangle = new Triangle(10);
        float area = triangle.calculateArea();
        assertEquals(43.3f, area);
    }

    @Test
    public void test2() {
        Triangle triangle = new Triangle(5);
        float area = triangle.calculateArea();
        assertEquals(10.825f, area);
    }
}