# Week4-java-assignment1

## Problem Statement 

Solve the below problem statement: (Use constructor, destructor , POJO where ever it is possible.).
Write a java class (Int_Arr_Process) 

1.	It is class to process a integer array.
1.	It should the following
    1.	It should define a integer array of given size
    1.	If the size is not give it should define  a array of 10
    1.	It should be able to adopt a given array
    1.	Should have a copy constructor
    1.	A function to read array
    1.	A function to display array horizontally  and vertically both
    1.	A function to Sort a array
    1.	A function to Find biggest and smallest element
    1.	A function to  Find the sum of all the element
    1. If the second biggest (considering there is a possibility of the 1st biggest duplication)


## How to run the Project

* Using Eclipse IDE.
    1. Open Project in Eclipse IDE.
    2. Execute IntArrProcessRunner as a Java Application.

* Using Command Prompt / Console
    * Change Directory to Project Root.
    * To Test Project run : `java -cp week4-java-assignment1.jar org.junit.runner.JUnitCore com.sapient.week4.IntArrProcessTest`
    * To Execute Project run : `java -jar week4-java-assignment1.jar`

## Sample Output

### Junit Test Cases
    D:\Sapient\prejoining-learning-program\Week4\week4-java-assignment1>java -cp week4-java-assignment1.jar org.junit.runner.JUnitCore com.sapient.week4.IntArrProcessTest
    JUnit version 4.13
    .....
    Time: 0.011

    OK (5 tests)


### Execution
    D:\Sapient\prejoining-learning-program\Week4\week4-java-assignment1>java -jar week4-java-assignment1.jar
    Enter 5 Integers : 12 46 89 89 10
    Array Content : 12 46 89 89 10
    Sorting
    Array Content : 10 12 46 89 89
    Minimun : 10
    Maximum : 89
    Sum : 246
    Second Biggest number : 46