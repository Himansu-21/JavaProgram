public class car2 {
    int price ;
    String color,brand;
    double code;

    void driver(int price,String color,String brand){
        System.out.println("price :"+  price  + "color : "+ color + "brand : "+ brand +"code : "+ code );

    }
    void driver(String color,String brand){

    }
    void driver(String brand , String color,double code){

    }
    void driver(int price , double code){

    }

    public static void main(String[] args) {
        car2 x = new car2();
        x.driver(10, "blue", "od378");
        x.driver("green", "mm378");
        x.driver("green", "mm378",98.34);
        x.driver(23,98.54 );

        
    }
}
