package com;

class CalculatorImpl implements Calculator {   // rule-2

	@Override // rule-3
	public void add(int x,int y) {
		System.out.println("Sum of "+x+" & "+y+" is "+(x+y));
	}

	@Override // rule-3
	public void mul(int x,int y) {
		int prod = x* y;
		System.out.println("Product of "+x+" & "+y+" is "+prod);
	}
}
