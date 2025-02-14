package dot;

public class Car {
	int id;
    String brand;
    Double price;
    
    public Car(int id,String brand,Double price) {
		this.id=id;
		this.brand=brand;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}
}
