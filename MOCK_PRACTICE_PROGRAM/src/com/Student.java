package com;

public class Student {
		int id ;
		
		Student(int id){
			this.id = id;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student s = (Student)obj;
				return this.id == s.id;
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			return 123;
		}
		
		@Override
		public String toString() {
			return "Student Id= "+id;
		}
		
		public static void main(String[] args) {
			Student s = new Student(10);
			Student s1 = new Student(10);
			
			System.out.println(s.equals(s1));
			System.out.println(s.hashCode());
			System.out.println(s);
		}

}
