package com;

//
//	class Main {
//	   // int a=null;
//
//	    Main(String a) {
//	        //this.a = (int)a; // Convert String to int
//	    }
//
//	    public static void main(String[] args) {
//	        Main m = new Main("22");
//	       // System.out.println(m.a); // What will be the output?
//	    }
//	}
//-------------------------------------------------------------------


//class Main {
//    int a = 0;
//
//    Main(int a) {
//        this.a = this.a; // Assign parameter a to the instance variable a
//    }
//
//    public static void main(String[] args) {
//        Main m = new Main(22);
//        System.out.println(m.a); // Output will be 22
//    }
//}

//-----------------------------------------------------------------------

//public class Main {
//    Integer a = 10; // Integer object
//    Integer b = 10; // Another Integer object with the same value
//
//    public static void main(String[] args) {
//        Main m = new Main();
//        System.out.println(m.a.equals(m.b)); // Using equals() to compare a and b
//    }
//}

//----------------------------------------------------------------------

public class Main {
    Integer a = new Integer(10); // Explicitly creates a new Integer object
    Integer b = new Integer(10); // Creates another new Integer object with the same value

    public static void main(String[] args) { 
        Main m = new Main();
        System.out.println(m.a.equals(m.b)); // Using equals() to compare a and b
    }
}


	