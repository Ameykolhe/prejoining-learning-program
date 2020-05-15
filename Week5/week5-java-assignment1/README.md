# Week5-java-assignment1

## Problem Statement

Write a java program to read details of n students and do the following  
1. Create Student POJO class to store id, name and city
1. Create a business object to class for the student to do the following 
    1. Read student 
    1. Display student
    1. Display all the student belong to a particular city
    1. Display name wise sorted
    1. Display city wise sorted.
    1. Display student details for a given id handle student not found exception

## How to run the Project

- Using Eclipse IDE
    1. Open Project in Eclipse IDE.
    1. Execute Assignment1Runner as Java Application

- Using Command Prompt / Console
    1. Change Directory to Project Root.
    1. To Exectute Project Run : `java -jar week5-java-assignment1.jar`


## Sample Output

    D:\PublicisSapient\prejoining-learning-program\Week5\week5-java-assignment1>java -jar week5-java-assignment1.jar


    --------------------- DisplayAllStudents ---------------------

    Student [id=1, name=Amey, city=Alibag]
    Student [id=2, name=Mandar, city=Pune]
    Student [id=3, name=Aditya, city=Banglore]
    Student [id=4, name=Pratik, city=Mumbai]
    Student [id=5, name=Adeep, city=Pune]


    --------------- DisplayStudentsBelongingToCity ---------------

    Student [id=2, name=Mandar, city=Pune]
    Student [id=5, name=Adeep, city=Pune]


    ------------------- DisplayNamewiseSorted -------------------

    Student [id=5, name=Adeep, city=Pune]
    Student [id=3, name=Aditya, city=Banglore]
    Student [id=1, name=Amey, city=Alibag]
    Student [id=2, name=Mandar, city=Pune]
    Student [id=4, name=Pratik, city=Mumbai]


    ------------------- DisplayCitywiseSorted -------------------

    Student [id=1, name=Amey, city=Alibag]
    Student [id=3, name=Aditya, city=Banglore]
    Student [id=4, name=Pratik, city=Mumbai]
    Student [id=2, name=Mandar, city=Pune]
    Student [id=5, name=Adeep, city=Pune]


    ------------------- SearchStudentWithId --------------------

    Student [id=2, name=Mandar, city=Pune]


    ------------------- SearchStudentWithId --------------------

    com.sapient.week5.exceptions.StudentNotFoundException [StudentId=10]