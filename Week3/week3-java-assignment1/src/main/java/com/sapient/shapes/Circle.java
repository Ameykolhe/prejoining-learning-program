package com.sapient.shapes;

public class Circle {

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }


    float calculateArea() {
        return 3.14f * this.radius * this.radius;
    }

}