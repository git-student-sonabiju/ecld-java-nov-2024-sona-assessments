package com.ecld.java.assess4b;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static Map<String, DepartmentStats> analyzeDepartments(List<Employee> employees) {
		return employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment))//grouping employees by departments
				.entrySet().stream()
				.filter(entry -> entry.getValue().size() > 2)  // departments with more than 2 employees
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						entry -> {
							List<Employee> deptEmployees = entry.getValue();
							double avgSalary = deptEmployees.stream()
									.collect(Collectors.averagingDouble(Employee::getSalary));//averaging salary
							long empCount = deptEmployees.size();//employees count
							Set<String> uniqueSkills = deptEmployees.stream()
									.flatMap(emp -> emp.getSkills().stream())
									.collect(Collectors.toSet());
							return new DepartmentStats(avgSalary, empCount, uniqueSkills);
						}
				));
	}

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("John", "IT", 75000, Arrays.asList("Java", "SQL")),
				new Employee("Alice", "IT", 82000, Arrays.asList("Python", "Java")),
				new Employee("Bob", "HR", 65000, Arrays.asList("Communication")),
				new Employee("Charlie", "IT", 78000, Arrays.asList("Java", "AWS"))
		);
		Map<String, DepartmentStats> departmentStats = analyzeDepartments(employees);
		departmentStats.forEach((department, stats) ->
		{
			System.out.println(department + ": " + stats);
		});
	}
}
