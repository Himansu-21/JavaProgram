package compare;

import java.util.TreeSet;

public class MainClass {
	public static void main(String[] args) {
		TreeSet<Pen> t = new TreeSet<Pen>(new PenComparator());
		t.add(new Pen(48));
		t.add(new Pen(35));
		t.add(new Pen(20));
		
		for(Pen p : t) {
			System.out.println(p);
		}
	}

}
