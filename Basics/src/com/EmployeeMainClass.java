package com;

import java.util.ArrayList;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(20,"Himansu");
		Employee e2 = new Employee(30,"Vikas");
		
		
		ArrayList <Employee>l1 = new ArrayList<Employee>();
		l1.add(e1);
		l1.add(e2);
		
		l1.add(new Employee(40,"lalit"));
		
		for(Employee emp : l1) {
			System.out.println(emp.id+" "+emp.name);
		}
	}

}
