package com.ecld.java.assess4b;

import java.util.List;

public class Employee {
	private String name;
	private String department;
	private double salary;
	private List<String> skills;

	// Constructors,getters and setters

	public Employee(String name, String department, double salary, List<String> skills) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public List<String> getSkills() {
		return skills;
	}
}
