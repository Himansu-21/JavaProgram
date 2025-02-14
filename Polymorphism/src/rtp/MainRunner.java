package rtp;

class MainRunner {
	
	static void display(Employee obj) {
		obj.work();
	}

	public static void main(String[] args) {
		
		// Upcasting 
		// 1. using method
		
		display(new Developer());
		display(new Tester());
		
		System.out.println("-----------------");
		// 2. using separate reference variables
		
		Employee e1 = new Developer();
		e1.work();
		Employee e2 = new Tester();
		e2.work();
		
		System.out.println("-----------------");
		// 3. using single reference variable
		
		Employee e;
		e = new Developer();
		e.work();
		e = new Tester();
		e.work();
	}
}
