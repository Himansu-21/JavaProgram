package com;

public class Student {

	int studentId;
	String studentName;
	String email;
	long phno;
	
	public Student(int studentId,String studentName,long phno) {
		
		this.studentId=studentId;
		this.studentName=studentName;
		this.phno=phno;
	}
	
	public Student(int studentId,String studentName,long phno,String email) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.phno=phno;
		this.email=email;
	}
	
	public Student(int studentId,String studentName,String email) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.email=email;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Ram", 9876574932L);
		
		Student s2 = new Student(102,"Laxman",6204645728L,"Laxman435@gmail.com");
		
		Student s3 = new Student(103, "Naman", "Naman2@gmail.com");
		
		System.out.println(" Student Name : "+s1.studentName);
		System.out.println(" Student id : "+s1.studentId);
		System.out.println(" phno : "+s1.phno);
		System.out.println(" email : "+s1.email);
		System.out.println("-----------------");
		
		System.out.println(" Student Name : "+s2.studentName);
		System.out.println(" Student id : "+s2.studentId);
		System.out.println(" phno : "+s2.phno);
		System.out.println(" email : "+s2.email);
		System.out.println("-----------------");
		
		System.out.println(" Student Name : "+s3.studentName);
		System.out.println(" Student id : "+s3.studentId);
		System.out.println(" phno : "+s3.phno);
		System.out.println(" email : "+s3.email);
		System.out.println("-----------------");
	}
}
