package rtp;

class Employee {

	void work() {
		System.out.println("Employee is working");
	}
}

class Developer extends Employee {

	@Override
	void work() {
		System.out.println("Developer is developing the App");
	}
}

class Tester extends Employee {

	@Override
	void work() {
		System.out.println("Tester is testing the App");
	}
}