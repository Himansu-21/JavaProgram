package javabean;

import java.util.Scanner;

public class HotelMainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Hotel h = new Hotel();
	
		System.out.println("Enter Hotel Name");
		String hName=sc.next();
		h.setName(hName);
		
		System.out.println("Enter Rating");
		double hRating = sc.nextDouble();
		h.setRatings(hRating);
		
		String hotelName=h.getName();
		
		double hotelRating = h.getRatings();
		
		System.out.println("Hotel Name: "+hotelName);
		System.out.println("Hotel Ratings: "+hotelRating);
		
		sc.close();
	}
}
