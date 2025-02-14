package constructor_initialization;

public class Car {
	
		String brand;
		double cost;
	static String color ;
		
		Car(String brand, double cost){
			this.brand = brand;
			this.cost = cost;
		}
		
	public static void main (String [] args) {
				Car c1 = new Car("bmw",2500000);
				Car c2 = new Car("od",1500000);
				
				System.out.println("brand: "+ c1.brand +" //"+"cost:  "+ c1.cost );
				System.out.println("brand: "+ c2.brand +" //"+ "cost: " + c2.cost);
				System.out.println(Car.color);
				System.out.println(color);
	}
}
