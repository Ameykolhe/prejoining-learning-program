package com.sapient.shapes;

import java.util.Scanner;

public class Shapes {
    
    int numberOfSides;
    int sideLength;

    Shapes() {

    }

    Shapes(int numberOfSides, int sideLength) {
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }


    String calculateShapeArea() {
        if( this.numberOfSides == 1 ) {
            Circle circle  = new Circle(this.sideLength);
            float area = circle.calculateArea();
            // System.out.println("The Area of the Circle is : " + area);

            return "The Area of the Circle is : " + area;
        } 
        else if ( this.numberOfSides == 3 ) {
            Triangle triangle = new Triangle(this.sideLength);
            float area = triangle.calculateArea();
            // System.out.println("The Area of the Triangle is : " + area);
            return "The Area of the Triangle is : " + area;
        }
        else if ( this.numberOfSides == 4 ) {
            Square square = new Square(this.sideLength);
            int area = square.calculateArea();
            // System.out.println("The Area of the Square is : " + area);
            return "The Area of the Square is : " + area;
        }
        else {
            // System.out.println("No Shapes Present");
            return "No Shapes Present";
        }
    }

    public static void main(String[] args) {
    
        Shapes shapes = new Shapes();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numberOfSides : ");
        int numberOfSides = sc.nextInt();

        System.out.print("Enter sideLength : ");
        int sideLength = sc.nextInt();

        sc.close();

        shapes.setNumberOfSides(numberOfSides);
        shapes.setSideLength(sideLength);

        String result = shapes.calculateShapeArea();
        System.out.println(result);

        // // Test Case 1 : numberOfSides = 3, sideLength = 12

        // shapes.setNumberOfSides(3);
        // shapes.setSideLength(12);

        // String result = shapes.calculateShapeArea();

        // System.out.println(result);


        // // Test Case 2 : numberOfSides = 4, sideLength = 15

        // shapes.setNumberOfSides(4);
        // shapes.setSideLength(15);

        // result = shapes.calculateShapeArea();

        // System.out.println(result);


        // // Test Case 3 : numberOfSides = 5, sideLenght = 15

        // shapes.setNumberOfSides(5);
        // shapes.setSideLength(15);

        // result = shapes.calculateShapeArea();

        // System.out.println(result);

    }
}