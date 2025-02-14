package com;

public class Website {
	
	void login(String email,String pwd)
	{
		System.out.println("Login through email and password ");
	}
	
	void login(long phno,int otp)
	{
		System.out.println("LOgin through phone Number and OTP ");
	}
	
	void login(String userName,long phno,String pwd)
	{
		System.out.println("Login through UserName, Phone Number and Password");
	}
	
	public static void main(String[] args) {
		
		Website w = new Website();
		
		w.login(9873482748L, 4718);
		
		w.login("parasar123@gmail.com", "pa2sw0rd");
		
		w.login("Priyanshu", 8727237237L, "pa2sw0rd");
	}

}
