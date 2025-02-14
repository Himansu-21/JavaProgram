class student {
    String name;
    int age;
    static String Fullname;
    static int regd;

    {
        name = "Akash";
        age = 22;
        System.out.println("no static block");
    }

    static {
        Fullname="Himanshu";
        regd=455124544;
        System.out.println("Block");
    }

    void dis()
    {
        System.out.println(name+" "+age);
    }

    static void sisp()
    {
        System.out.println(Fullname+" "+regd);
    }

    public static void main(String[] args) {

        // student.sisp();
        student s= new student();
        s.dis();
    }
}
