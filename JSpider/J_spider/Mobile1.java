
    public class Mobile1{
        String brand;
        int modelno ;
        long cost ;
    
        Mobile1 (String brand, int modelno, long cost) {
    
            this.brand = brand;
            this.modelno = modelno;
            this.cost = cost;
    
        }
    
        public static void main(String[] args) {
            Mobile1 m1 = new Mobile1("iphone" , 16 ,100000);
            Mobile1 m2 = new Mobile1("samsung" , 24 ,150000);
    
            System.out.println(m1.brand + " " + m1.modelno + " " + m1.cost);
            System.out.println(m2.brand + " " + m2.modelno + " " + m2.cost);
        }
    }
    

