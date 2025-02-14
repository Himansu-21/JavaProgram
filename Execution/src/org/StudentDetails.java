package org;

public class StudentDetails extends Details{

	@Override
	void showDetails()
	{
		System.out.println("Student Name is "+this.name+" and Student Id is "+this.id);
		//super.showDetails();
	}
}
