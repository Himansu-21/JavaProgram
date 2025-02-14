package comm;
//run time polymorphism
class MainClass {
	

	static void decideVehicle(Vehicle obj) {
		obj.start();
	}
	
	public static void main(String[] args) {
		
		// 1. Upcasting using method
		decideVehicle(new Car());   
		decideVehicle(new Bike());  
		
		System.out.println("--------------");
		
		// 2. Upcasting using seperate reference variable
		Vehicle v1= new Car();   
		v1.start();
		Vehicle v2 = new Bike();  
		v2.start();
		
		System.out.println("------------");
		
		// 3. Upcasting using single reference variable
		Vehicle v;
		v = new Car();  
		v.start();
		v= new Bike();   
		v.start();
	}

}
