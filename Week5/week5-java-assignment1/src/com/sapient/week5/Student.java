package com.sapient.week5;

import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	private String city;
	
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public int hashCode() {
		return Objects.hash(city, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
