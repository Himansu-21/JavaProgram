package comm;

import java.util.Scanner;
//Encapsulation
public class EmployeeMainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Enter Employee id");
		int id=sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String name = sc.next();
		
		emp.setId(id);
		emp.setName(name);
		
		String empName = emp.getName();
		int empId= emp.getId();
		
		System.out.println("Employee name :"+empName+" Employee id:"+empId);
		
		sc.close();
	}
}
