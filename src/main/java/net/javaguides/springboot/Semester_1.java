package net.javaguides.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Semester_1 {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int rollno;
	private int marks_maths;
	private int marks_english;
	private int marks_science;
	
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
public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}
public int getMarks_maths() {
	return marks_maths;
}

public void setMarks_maths(int marks_maths) {
	this.marks_maths = marks_maths;
}
public int getMarks_english() {
	return marks_english;
}

public void setMarks_english(int marks_english) {
	this.marks_english = marks_english;
}
public int getMarks_science() {
	return marks_science;
}

public void setMarks_science(int marks_science) {
	this.marks_science = marks_science;
}
}
