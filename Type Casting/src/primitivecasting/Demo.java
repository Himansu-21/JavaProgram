package primitivecasting;

class Demo {
	
	public static void main(String[] args) {
		
		//Widening
		int a =25;
		double b = a;
		System.out.println(a+" "+b);  // 25 25.0
		
		double c = 33;
		System.out.println(c); // 33.0
		
		char x = 'F';
		int y = x;
		System.out.println(x+" "+y);  // F 70
		
		System.out.println("---------");
		//Narrowing
		double d = 23.57;
		int aa = (int) d;
		System.out.println(d+" "+aa);  // 23.57 23
		
		int ch = 72;
		char ch1 = (char) ch;
		System.out.println(ch+" "+ch1); // 72 H
		
		System.out.println("--------------");
		
		System.out.println((char)(int)65.23);
		
		System.out.println("--------------");
		System.out.println((int)65.23); // 65
		System.out.println((char)65); // A
		System.out.println("A"+"B"); // AB
		System.out.println("A"+10); // A10
		System.out.println('A'+"B"); // AB
		System.out.println("A"+10+20); //A1020
		System.out.println(10+20+"A"); // 30A
		System.out.println('A'+'B'); // 131
		System.out.println('a'+20); // 117
		
		
	}

}
