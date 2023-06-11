package hello;

public class Constructors {
public static void main(String[] args) {
	Pizza p = new Pizza(8);
	Pizza pie = new Pizza(6);
	p.eat();
	System.out.println(p.slices);
	System.out.println(pie.slices);
	
}
}

class Pizza {
	int slices;
	String[] toppings;
	Pizza() {} //have to define the default constructor here because it can't access the constructor in the main class.
	Pizza(int pieces) {
		slices = pieces;
	}
	public void eat() {
		slices = slices - 1;
	}
}
