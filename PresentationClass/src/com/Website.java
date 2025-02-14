package com;

public class Website {

	void login(String username, String pass) {
		System.out.println("welcome");
	}
	void login(long phno, int otp) {
		System.out.println("hello,Website");
	}
	void login(String email, long phno, String pass) {
		System.out.println("Good..morning");
	}

	public static void main(String[] args) {
		Website w = new Website();

		w.login("Himansu", "him@234");
		w.login(8984009884l,2580);
		w.login("akash@gmail.com", 9239087634l,"akash@23");



	}
}
