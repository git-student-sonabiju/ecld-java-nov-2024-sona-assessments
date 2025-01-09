package com.ecld.java.assess4b;

import java.util.Set;

public class DepartmentStats {
	private double averageSalary;
	private long employeeCount;
	private Set<String> uniqueSkills;

	// Constructors,getters and setters

	public DepartmentStats(double averageSalary, long employeeCount, Set<String> uniqueSkills) {
		this.averageSalary = averageSalary;
		this.employeeCount = employeeCount;
		this.uniqueSkills = uniqueSkills;
	}

	public double getAverageSalary() {
		return averageSalary;
	}

	public long getEmployeeCount() {
		return employeeCount;
	}

	public Set<String> getUniqueSkills() {
		return uniqueSkills;
	}

	@Override
	public String toString() {
		return "DepartmentStats{" +
				"AverageSalary=" + averageSalary +
				", EmployeeCount=" + employeeCount +
				", UniqueSkills=" + uniqueSkills +
				'}';
	}
}
