package data_structs;

import java.util.Objects;

public class Equals {

	public static void main(String[] args) {
		Pizza one = new Pizza();
		Pizza two = new Pizza();
		one.size = 14;
		one.topping = "Pepperoni";
		two.size = 10;
		two.topping = "Onion";
		// System.out.println(one == two); <== bad practice with comparing objects
		System.out.println(one.equals(two));
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
	}

}

class Pizza {
	int size = 0;
	String topping = null;
	
	public int hashCode() {
		if(topping != null) {
			return size * topping.hashCode();
		} else {
			return size;
		}
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		return size == other.size && Objects.equals(topping, other.topping);
	}

}
