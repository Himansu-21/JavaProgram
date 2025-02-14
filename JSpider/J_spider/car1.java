public class car1 {
    int price ;
    String color;
    String brand;

    car1(int price , String color, String brand){
            this.price = price;
            this.color = color;
            this.brand = brand;
    }
    car1(String brand, String color){
        this.brand = brand;
        this.color = color;

    }
    void driver() {
        System.out.println("my name is Himansu");
    }

    public static void main(String[] args) {
        car1 c= new car1(100000,"blue","od07");
        car1 c1= new car1(100000,"blue","od07");

        System.out.println("  price :"+ c.price + "  color: " +c.color +"  brand: "+ c.brand);
        System.out.println( "  color: " +c1.color +"  brand: "+ c1.brand);
        System.out.println(c.price);
        c.driver();
    }
}
