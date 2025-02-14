package javabean;

public class Hotel {

	private String name;
	private double ratings;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setRatings(double ratings) {
		this.ratings=ratings;
	}
	
	public String getName() {
		return name;
	}
	
	public double getRatings() {
		return ratings;
	}
}
