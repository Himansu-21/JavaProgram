package org;

public class Test {


	
	static void displayMarks(String subject,double marks)
	{
		System.out.println("Subject :"+subject+" Marks :"+marks);
	}
	
	static void displayMarks(String subject,double marks,String name)
	{
		System.out.println("Subject :"+subject+" Marks :"+marks+" Student :"+name);
	}
	
	public static void main(String[] args) {
		Test.displayMarks("Math", 72);
		Test.displayMarks("Physics", 68, "Priyanshu");
	}
}
