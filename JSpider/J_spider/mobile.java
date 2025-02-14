public class mobile {
    String model ="Xiomi";
    String make = "Samsung";
    int price = 20000;


    void SwitchOn(){
        System.out.println(this.make + "mobile Switch On");
        }
    public static void main(String[] args) {
       mobile m = new mobile();
            // m.SwitchOn ();
            m.call();
            m.SwitchOn ();
    }
       void call(){
        System.out.println("call");
       

    }
}
