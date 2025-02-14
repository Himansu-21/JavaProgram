package com;

class MainSolution {

	static void display(Employee obj) {

		if (obj instanceof Developer) {
			Developer d = (Developer) obj;   // Downcasting to Developer
			System.out.println("Id: "+d.id); // accessing id
			d.develop();                     // and develop()
		}
		else if (obj instanceof Tester) {
			Tester t= (Tester) obj;           // Downcasting to Tester
			System.out.println("Id: "+t.id);  // accessing id
			t.test();                         // and test()
		}

	}

	public static void main(String[] args) {

		display(new Developer());
		System.out.println("-------------");
		display(new Tester());
	}
}
