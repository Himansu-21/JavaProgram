package javabean;

public class Person {

	private int age;

	public void setAge(int age)
	{
		if(age>0)
		{
			this.age=age;
			System.out.println("Valid Age");
		}
		else
			System.out.println("Invalid Age");
	}

	public int getAge()
	{
		return age;
	}

}
