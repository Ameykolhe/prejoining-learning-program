# Week4-java-assignment2

## Problem Statement

Solve the below problem statement: (Use constructor, destructor , POJO where ever it is possible.).

1.	It is class to process a matrix array.
1.	It should the following
    1. It should define  a matrix of given size
    1. If the size is not give it should define  a matrix of 3x3
    1. It should be able to adopt a given matrix
    1. Should have a copy constructor
    1. A function to read matrix
    1. A function to display  matrix in a matrix format
    1. A function to add two matrix function should receive one matrix and return the addition matrix
    1. A function to Find matrix is scalar or not
    1. A function multiply the two matrix function should receive one matrix and return the multiplied matrix


## How to run the Project

1. Using Eclipse IDE.
    * Open Project in Eclipse IDE.
    * Execute MatrixRunner as a Java Application.

1. Using Command Prompt / Console
    * Change Directory to Project Root.
    * To Test Project run : `java -cp week4-java-assignment2.jar org.junit.runner.JUnitCore com.sapient.week4.MatrixTest`
    * To Execute Project run : `java -jar week4-java-assignment2.jar`


## Sample Output

### Junit Test Cases
    D:\Sapient\prejoining-learning-program\Week4\week4-java-assignment2>java -cp week4-java-assignment2.jar org.junit.runner.JUnitCore com.sapient.week4.MatrixTest
    JUnit version 4.13
    ......
    Time: 0.009

    OK (6 tests)

### Execution

    D:\Sapient\prejoining-learning-program\Week4\week4-java-assignment2>java -jar week4-java-assignment2.jar
    --------------------- Matrix A ---------------------
    Enter 3 x 3 matrix Content :
    9 8 7
    6 5 4
    3 2 1
    --------- Matrix ----------
    9 8 7
    6 5 4
    3 2 1


    --------------------- Matrix B ---------------------
    --------- Matrix ----------
    1 2 3
    4 5 6
    7 8 9


    --------------------- Matrix C ---------------------
    --------- Matrix ----------
    1 0 0 0 0
    0 2 0 0 0
    0 0 3 0 0
    0 0 0 4 0
    0 0 0 0 5


    -------------------- Operations --------------------

    Matrix A + Matrix B
    --------- Matrix ----------
    10 10 10
    10 10 10
    10 10 10

    Matrix A * Matrix B
    --------- Matrix ----------
    90 114 138
    54 69 84
    18 24 30

    Check if Matrix C is Scalar Matrix
    Matrix C is Scalar