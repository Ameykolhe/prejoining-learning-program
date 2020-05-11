package com.sapient.shapes;

public class Square {
    int sides;

    Square(int sides) {
        this.sides = sides;
    }


    int calculateArea() {
        return  this.sides * this.sides;
    }

}