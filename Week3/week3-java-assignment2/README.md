# week3-java-assignment2

## Problem Statement

Solve the below problem statements: (below classes should not have main method. A separate class should have main method to execute the below classes).
1. Write a java class to read n numbers from command line argument and display sum, avg and biggest and smallest.
    *  Class name : Command_Line1
    *  Methods : setData, calData, displayData.
1. Write a java class to read n numbers from key board and display all the numbers, sort the number, and do  search.
    *  Class name : KeyRead_Line2
    *  Methods :Read, display, sort, find
1. Writ a java class which has static method fig_to_words  which takes amount a long and converts figure to words and return a string.
    *  Example input is 132 the output should be one hundred and thirty two only.

## Objective

* Develop simple Java program using if-else if - else statement


## How to run the Project

Execute the Following commands from the Project Root Direcotry.
Action | Command
-------|---------
Compile Project | `mvn clean compile`
Package| `mvn clean package`
Execute Jar| `java -jar target\week3-java-assignment2-1.0-SNAPSHOT.jar`

## Sample Output

    D:\Sapient\prejoining-learning-program\Week3\week3-java-assignment2>java -jar target\week3-java-assignment2-1.0-SNAPSHOT.jar 10 15 5 46 79 100 30 49 66
    [10, 15, 5, 46, 79, 100, 30, 49, 66]


    ------------------------------- CommandLine1 -------------------------------
    Maximum : 100
    Minimum : 0
    Sum     : 400
    Avegage : 44.444443


    ------------------------------- KeyReadLine2 --------------------------------
    Enter numbers : 12 46 85 94 76 32 56 100 13
    Content of Array is : [12, 46, 85, 94, 76, 32, 56, 100, 13]
    Sorting
    Content of Array is : [12, 13, 32, 46, 56, 76, 85, 94, 100]
    Enter Number to Search : 56
    Found 56 at index 4


    ------------------------------- NumberToWord --------------------------------
    Enter Number : 45612361
    The Num 45612361 in words is :  forty five million six hundred twelve thousand three hundred sixty one
