package com;
//Accessing public member in different class , same package.
public class EmployeeMain {
		public static void main(String[] args) {
			
			Employee emp = new Employee();
			
			System.out.println("Emp Id : "+emp.id);
			System.out.println("Emp name : "+emp.name);
			
			Employee.work();
		}
}
