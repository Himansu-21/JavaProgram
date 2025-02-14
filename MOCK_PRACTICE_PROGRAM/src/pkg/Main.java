package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		HashSet<Student> h = new HashSet<Student>();
		h.add(new Student(101, 95.6));
		h.add(new Student(103, 97.6));
		h.add(new Student(102, 96.6));
		h.add(new Student(102, 98.6));
		
		ArrayList<Student> a = new ArrayList<Student>(h);
		
		
		Collections.sort(a,new StudentComparater());
		
	    Iterator<Student> i = a.iterator();
	    
	    while(i.hasNext()) {
	    	System.out.println(i.next());
	    }
		
	}
}
