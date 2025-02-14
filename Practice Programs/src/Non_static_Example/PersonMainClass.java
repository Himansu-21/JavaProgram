package Non_static_Example;

public class PersonMainClass {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println(p.age + " " + p.name);
		p.eat();
	}
}
