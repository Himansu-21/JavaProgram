package com;

public class CalculatorImpl implements Calculator {
	@Override
	public void add(int x , int y) {
		System.out.println("sum of "+x+"& "+y+"is "+ (x+y));
	}
	
	@Override
	public void sub(int x , int y) {
		System.out.println("difference of "+x+"& "+y+"is "+ (x-y));
		
	}
	@Override
	public void mul(int x , int y) {
		System.out.println("product of "+x+"& "+y+"is "+ (x*y));
		
	}
	
	@Override
	public void div(int x , int y) {
		System.out.println("division of "+x+"& "+y+"is "+ (x/y));
		
	}

}
