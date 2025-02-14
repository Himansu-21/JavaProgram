package org;

public class Check {
	public class Main {
	    public static void main(String[] args) {
	        int a = 12;
	        int b = 12;
	       // System.out.println(a.equals(b));//compilation error
	        System.out.println(a == b); 
	        
	        Integer c = 128;
	        Integer d = 128;
	        
	        System.out.println(c.equals(d)); 
	        System.out.println(c == d);
	        
	        Integer x = 12; 
	        Integer y = 12; 
	        
	        System.out.println(x.equals(y)); 
	        System.out.println(x == y); 
	    }
	}


}
