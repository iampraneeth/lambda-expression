package com.capgemini.lambda.client;

import java.util.Comparator;
import java.util.TreeSet;

import com.capgemini.lambda.model.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		/*
		 * Comparator<Employee> c = new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { return
		 * Integer.compare(o1.getEmployeeId(), o2.getEmployeeId()); } };
		 */
		Comparator<Employee> c = (o1, o2) -> Integer.compare(o1.getEmployeeId(), o2.getEmployeeId());
		TreeSet<Employee> employee = new TreeSet<Employee>(c);
		employee.add(new Employee(101, "alex", "hr", 34000));
		employee.add(new Employee(56, "grant", "admin", 12000));
		employee.add(new Employee(88, "bob", "admin", 56000));
		employee.add(new Employee(12, "taylor", "HR", 12000));

		for (Employee employee2 : employee) {
			System.out.println(employee2);

		}
	}

}
