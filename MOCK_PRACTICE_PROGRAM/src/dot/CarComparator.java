package dot;

import java.util.Comparator;

public class CarComparator  implements Comparator<Car>{
	
	public int compare(Car c1,Car c2) {
		return c1.brand.compareTo(c2.brand);
	}

}