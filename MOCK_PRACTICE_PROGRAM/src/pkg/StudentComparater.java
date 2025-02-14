package pkg;

import java.util.Comparator;

public class StudentComparater  implements Comparator<Student> {
	
	public int compare(Student s1, Student s2) {
		
		return s1.mark.compareTo(s2.mark);
	}
   
}
