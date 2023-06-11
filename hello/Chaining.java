package hello;

public class Chaining {

	public static void main(String[] args) {
		JavaDev dev = new JavaDev("Java");

	}

}

class Employee {
	String name = "Bob Saget";
	public Employee() {
		System.out.println("Employee");
	}
}

class JavaDev extends Employee {
	String lang;
	public JavaDev() {
		super();
		System.out.println(name + " JavaDev");
	}
	
	public JavaDev(String lang) {
		this();
		this.lang = lang;
		System.out.println(lang);
	}
}