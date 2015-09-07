package net.cloudcentrik;

public class Student {

	private String name;
	private int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printStudentInfo() {
		System.out.println("Student Name: " + this.getName());
		System.out.println("Student Id: " + this.getId());
		System.out.println("-----------------------------");
		System.out.println("\n");

	}

}
