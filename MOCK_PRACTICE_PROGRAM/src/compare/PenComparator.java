package compare;

import java.util.*;

public class PenComparator implements Comparator<Pen> {

	@Override
		public int compare (Pen x, Pen y) {
		return x.cost - y.cost;
//		return y.cost - x.cost;
	
//		return x.cost.compareTo(y.cost);
		}
}
