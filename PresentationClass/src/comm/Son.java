package comm;

class Son  extends Father{
	
	Son(){
		//super(); is called implicitly
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s);;
	}

}
