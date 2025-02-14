package com;

public class Employee {
	int id;
	String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	//Internally emp.toString method is overridden
//	@Override
//	public String tostring() {
//		return "Id is:- "+id +"Name is:- "+ name ;
//		
//	} 

}
