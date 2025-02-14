package Storing_objects;

public class StudentMainClass {
			public static void main(String[] args) {
				Student s1 = new Student(23,"himansu");
				Student s2 = new Student(20,"Akash");
				Student s3 = new Student(22,"himesh");
				
				Student[] s= {s1,s2,s3};
				
				for(int i=0;i<s.length;i++) {
					System.out.println("Age: "+s[i].age+" name: " +s[i].name);
					
					
				}
			}
}
