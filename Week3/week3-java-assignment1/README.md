# week3-java-assignment1


## Problem Statement
Develop classes named **Circle**, **Square** and **Triangle**. Each class should have a method named `calculateArea()` which calculates the area based on the below logic and display the appropriate message.

ClassName | MethodName | VariableName | VariableType | Logic
----------|------------|--------------|--------------|-------
Circle | calcualteArea | radius | int | 3.14 * radius * radius
Triangle| calcualteArea | sides | int | 0.433 * sides * sides
Square| calcualteArea | sides | int | sides * sides

Develop a Class **Shapes** inside the package **com.sapient.shapes**. the class should have one instance variable of type int named `numberOfSides` and a method called `calculateShapeArea()` This method takes two arguments one for identifying the shape and other for side length.\
In the Shapes Class add a main method which sets the values and invokes the `CalculateShapeArea()` method.


## Objective

* Develop simple Java program using if-else if - else statement


## How to run the Project

Execute the Following commands from the Project Root Direcotry.
Action | Command
-------|---------
Compile Project | `mvn clean compile`
Execute tests | `mvn clean test`
Package| `mvn clean package`
Execute Jar| `java -jar target\week3-java-assignment1-1.0-SNAPSHOT.jar`

## Sample Output

    D:\Sapient\prejoining-learning-program\Week3\week3-java-assignment1>java -jar target\week3-java-assignment1-1.0-SNAPSHOT.jar
    Enter numberOfSides : 3
    Enter sideLength : 12
    The Area of the Triangle is : 62.352