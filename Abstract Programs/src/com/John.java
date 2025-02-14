package com;

class John extends Flipkart {

	@Override
	void buy() {
		System.out.println("Buying Products from Flipkart");
	}
	
	@Override
	void pay() {
		System.out.println("Paying 34000 from PhonePe");
	}
	
	public static void main(String[] args) {
		
		John j = new John();
		
		j.buy();
		j.pay();
	}
}
