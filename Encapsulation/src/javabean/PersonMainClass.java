package javabean;

import java.util.Scanner;

public class PersonMainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person p = new Person();
		
		System.out.println("Eater age: ");
		int age = sc.nextInt();
		
		p.setAge(age);
		
		System.out.println("Age is "+p.getAge());
		
		sc.close();
		
	}
}
