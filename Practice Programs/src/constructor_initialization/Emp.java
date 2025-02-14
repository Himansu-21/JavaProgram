package constructor_initialization;

public class Emp {
	int id ;
	String name;
	double salary;

	Emp(int id , String name, double salary){

		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public static void main(String[] args) {
		Emp e1 = new Emp (3250,"Himansu",250000);
		Emp e2 = new Emp (5069,"dev",300000);

		System.out.println(e1.id+" "+ e1.name +" "+e1.salary);
		System.out.println(e2.id+" "+ e2.name +" "+e2.salary);
	}
}
