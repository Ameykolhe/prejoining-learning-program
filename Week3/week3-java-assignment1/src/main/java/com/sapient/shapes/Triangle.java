package com.sapient.shapes;

public class Triangle {

    int sides;

    Triangle(int sides) {
        this.sides = sides;
    }


    float calculateArea() {
        return 0.433f * this.sides * this.sides;
    }

}