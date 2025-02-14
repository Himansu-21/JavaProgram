package comm;
//compile time polymorphism
class StudentMainClass {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.display("Vikarm");
		s.display(20);
		s.display("Jack", 27);
		s.display(22, "Vedaa");
	}

}
