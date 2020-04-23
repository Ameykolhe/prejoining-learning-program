package com.sapient.shapes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShapesTest {

    Shapes shapes;

    @Before
    public void initialize() {
        shapes = new Shapes();
    }

    @Test
    public void test1() {
        shapes.setNumberOfSides(1);
        shapes.setSideLength(18);

        String result = shapes.calculateShapeArea();

        assertEquals("The Area of the Circle is : 1017.36", result);
    }

    @Test
    public void test2() {
        shapes.setNumberOfSides(3);
        shapes.setSideLength(12);

        String result = shapes.calculateShapeArea();

        assertEquals("The Area of the Triangle is : 62.352", result);
    }

    @Test
    public void test3() {
        shapes.setNumberOfSides(4);
        shapes.setSideLength(15);

        String result = shapes.calculateShapeArea();

        assertEquals("The Area of the Square is : 225", result);
    }

    @Test
    public void test4() {
        shapes.setNumberOfSides(5);
        shapes.setSideLength(15);

        String result = shapes.calculateShapeArea();

        assertEquals("No Shapes Present", result);
    }
}