package com;

class Jack implements Uber{

	@Override
	public void payAmount() {
		System.out.println("Paying for the cab");
	}

	@Override
	public void bookCab() {
		System.out.println("Booking a cab");
	}

	public static void main(String[] args) {

		Jack j = new Jack();

		j.bookCab();
		j.payAmount();
	}
}
