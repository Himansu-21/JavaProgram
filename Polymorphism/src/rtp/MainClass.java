package rtp;

class MainClass {
	
	// 1. decideVehicle(new Car()); --> Vehicle obj = new Car() -> obj.start();
	// 2. decideVehicle(new Bike()); --> Vehicle obj = new Bike() -> obj.start();

	static void decideVehicle(Vehicle obj) {
		obj.start();
	}
	
	public static void main(String[] args) {
		
		// 1. Upcasting using method
		decideVehicle(new Car());   // rule-3
		decideVehicle(new Bike());  // rule-3
		
		System.out.println("--------------");
		
		// 2. Upcasting using seperate reference variable
		Vehicle v1= new Car();    // rule-3
		v1.start();
		Vehicle v2 = new Bike();  // rule-3
		v2.start();
		
		System.out.println("------------");
		
		// 3. Upcasting using single reference variable
		Vehicle v;
		v = new Car();   // rule-3
		v.start();
		v= new Bike();   // rule-3
		v.start();
	}

}
