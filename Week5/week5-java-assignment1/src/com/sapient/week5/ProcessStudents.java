package com.sapient.week5;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import com.sapient.week5.exceptions.StudentNotFoundException;

public class ProcessStudents {
	
	private ArrayList<Student> students;

	public ProcessStudents(ArrayList<Student> students) {
		super();
		this.students = students;
	}
	
	public void displayStudents() {
		System.out.println("\n\n--------------------- DisplayAllStudents ---------------------\n");
		students.stream().forEach(System.out::println);
	}
	
	public void displayStudentsBelongingToCity(String city) {
		System.out.println("\n\n--------------- DisplayStudentsBelongingToCity ---------------\n");
		students.stream()
			.filter((Student student) -> student.getCity().equalsIgnoreCase(city))
			.forEach(System.out::println);;
	}
	
	public void displayNamewiseSorted() {
		System.out.println("\n\n------------------- DisplayNamewiseSorted -------------------\n");
		students.stream()
			.sorted((Student ob1, Student ob2) -> ob1.getName().compareTo(ob2.getName()))
			.forEach(System.out::println);;
	}
	
	public void displayCitywiseSorted() {
		System.out.println("\n\n------------------- DisplayCitywiseSorted -------------------\n");
		students.stream()
			.sorted((Student ob1, Student ob2) -> ob1.getCity().compareTo(ob2.getCity()))
			.forEach(System.out::println);;
	}
	
	public void searchStudentWithId(int id) throws NoSuchElementException{
		System.out.println("\n\n------------------- SearchStudentWithId --------------------\n");
		Student result = students.stream()
			.filter((Student student) -> student.getId() == id)
			.findAny()
			.orElseThrow(() -> new StudentNotFoundException(id));
		
		System.out.println(result);
	}

}
