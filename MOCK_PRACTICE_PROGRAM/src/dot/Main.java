package dot;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		TreeMap<Car, String> t = new TreeMap<Car, String>(new CarComparator());
		t.put(new Car(101, "A", 40.5), "Rajesh");
		t.put(new Car(103, "C", 40.5), "Rajesh");
		t.put(new Car(102, "B", 40.5), "Rajesh");

		Set<Car> keySet = t.keySet();
		for (Car c : keySet) {
			System.out.println(c + " -> " + t.get(c));
		}

		System.out.println();
		Iterator<Car> iterator = keySet.iterator(); 
		while (iterator.hasNext()) { 
			Car car = iterator.next(); 
			System.out.println(car + " -> " + t.get(car));
		}
	}
}
