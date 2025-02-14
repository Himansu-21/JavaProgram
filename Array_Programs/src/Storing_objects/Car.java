package Storing_objects;

public class Car {
	int cost;

	Car(int cost){
		this.cost=cost;
	}

	public static void main(String[] args) {
		Car c1 = new Car(2500);
		Car c2 = new Car(1500);
		
		// create two array object bcz of two object class
		Car[] c = new Car[2];
		c[0] = c1;
		c[1] = c2;
//		Car[] c = {c1,c2};


		for(int i=0;i<c.length;i++){
		//	System.out.println(i);
		//	System.out.println(c[i]);
			System.out.println(c[i].cost);
		}

	}
}
