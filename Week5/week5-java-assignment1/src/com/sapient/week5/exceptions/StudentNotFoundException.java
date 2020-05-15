package com.sapient.week5.exceptions;

public class StudentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7059627229071719689L;
	int id;

	public StudentNotFoundException(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return super.toString() + " [StudentId=" + id + "]";
	}


}
