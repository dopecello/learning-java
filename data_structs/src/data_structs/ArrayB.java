package data_structs;

import java.util.LinkedList;

public class ArrayB {

	public static void main(String[] args) {
		LinkedList<Pickle> list = new LinkedList<Pickle>();
		list.add(new Pickle("Dill"));
		list.add(new Pickle("Sweet")); //ArrayList and LinkedList implement the Link interface, so they have the same methods.
		
		list.get(1);
		
		list.remove(5);
		list.contains(new Pickle("Dill"));
	}

}

class Pickle {
	String flavor;

	public Pickle(String flavor) {
		this.flavor = flavor;
	}
}
