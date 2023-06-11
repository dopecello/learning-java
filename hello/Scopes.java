package hello;

public class Scopes {

	public static void main(String[] args) {
		Person one = new Person();
		Person two = new Person();
		one.age = 10;
		two.age = 20;
		Person.planet = "Earth";
		System.out.println(two.age);

	}

}

class Person {
	//instance
	int age;
	//class
	static String planet;
	//local 
	public void move(int distance) {
		{int x = 10; distance = 10;} //block
		x = 9;
		distance 10;
	}
}