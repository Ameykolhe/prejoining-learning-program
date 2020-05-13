package com.sapient.week5;

import java.util.ArrayList;

import com.sapient.week5.exceptions.StudentNotFoundException;

public class Assignment1Runner {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>() {
			private static final long serialVersionUID = 1L;
			{
				add(new Student(1, "Amey", "Alibag"));
				add(new Student(2, "Mandar", "Pune"));
				add(new Student(3, "Aditya", "Banglore"));
				add(new Student(4, "Pratik", "Mumbai"));
				add(new Student(5, "Adeep", "Pune"));
			}
		};
		
		ProcessStudents ob = new ProcessStudents(students);
		
		try {
			ob.displayStudents();
			ob.displayStudentsBelongingToCity("Pune");
			ob.displayNamewiseSorted();
			ob.displayCitywiseSorted();
			ob.searchStudentWithId(2);
			ob.searchStudentWithId(10);
		}
		catch (StudentNotFoundException ex) {
			System.out.println(ex);
		}
		
	}
}
