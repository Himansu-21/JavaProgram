package org;

import com.Father;

//Accessing protected member(method/variable) in different package 
class Son extends Father {
	public static void main(String[] args) {
		
		Son s = new Son();
		System.out.println(s.name);
		System.out.println(s.age);
	}

}
