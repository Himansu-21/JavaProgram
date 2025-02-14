package com;

public class Student {
	int Sid;
	long phno;
	String name,Email;


	Student(int Sid,String name){
		this.Sid = Sid;
		this.name = name;
	}
	Student(int Sid,String name, String Email){
		this.Sid = Sid;;
		this.name = name;
		this.Email = Email;
	}
	Student(int Sid,String name, long phno){
		this.Sid = Sid;
		this.name=name;
		this.phno = phno;
	}
	Student(int Sid,String name,long phno, String Email){
		this.Sid=Sid;
		this.phno=phno;
		this.name= name;
		this.Email=Email;
	}


	public static void main(String[] args) {
		Student s1= new Student(2447,"Sipun");
		Student s2= new Student(2568,"Bapun","priyanshu@gmail.com");
		Student s3= new Student(2984,"Akash",8984008984l);
		Student s4= new Student(6345,"Bikash",9556921835l,"bikash@gmail.com");

		System.out.println("Student_id-->"+s1.Sid+"  Student_Name->"+s1.name+"  Student_Phno-->"+s1.phno+"  Student_Email-->"+s1.Email);
		System.out.println("Student_id-->"+s2.Sid+"  Student_Name->"+s2.name+"  Student_Phno-->"+s2.phno+"  Student_Email-->"+s2.Email);
		System.out.println("Student_id-->"+s3.Sid+"  Student_Name->"+s3.name+"  Student_Phno-->"+s3.phno+"  Student_Email-->"+s3.Email);
		System.out.println("Student_id-->"+s4.Sid+"  Student_Name->"+s4.name+"  Student_Phno-->"+s4.phno+"  Student_Email-->"+s4.Email);
	}


}
