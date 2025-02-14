package com;

class Demo {
	int k = 9; 

	Demo(int k) { 
		//this.k = k; 
		k = this.k;
	}
	
	{
		k=12;
		int k = 20;
		this.k = k;
	}
	public static void main(String[] args) {
		Demo q = new Demo(50);
		System.out.println(q.k); 
	}
}


