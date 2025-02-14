package org;

public class Student {

	int studentId;
	String studentName;
	double marks;

	public Student(int studentId,String studentName,double marks) {
		this.studentId=studentId;
		this.marks=marks;
		this.studentName=studentName;
	}

	public static void main(String[] args) {

		Student s1 = new Student(101, "Ram", 76.4);

		Student s2 = new Student(102,"Laxman",86.9);

		Student s3 = new Student(103, "Naman", 68.5);
		
		Student s4 = new Student(104,"Rohit",62.1);

		Student s5 = new Student(105, "Virat", 48.7);
		
		Student[] s = {s1,s2,s3,s4,s5};
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(" Student Name : "+s[i].studentName);
			System.out.println(" Student id : "+s[i].studentId);
			System.out.println(" phno : "+s[i].marks);
			
			System.out.println("--------------------------");
		}
		
	}

}
