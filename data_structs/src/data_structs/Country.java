package data_structs;

import java.util.HashMap;

public class Country {

	public static void main(String[] args) {
		HashMap<String, Citizen> citizens = new HashMap<>();
		citizens.put("5001", new Citizen("Brian"));
		citizens.put("4524", new Citizen("Diane"));
//		citizens.put("4524", new Citizen("Betty"));  <== will override with Betty
		
		System.out.println(citizens.get("4524").name);
		
		System.out.println(citizens.size()); // <== number of mappings
		System.out.println(citizens.containsKey("5001")); // <== returns true
		System.out.println(citizens.containsValue("Sabrina")); // <== returns false
		System.out.println(citizens.entrySet()); // K, V
		System.out.println(citizens.keySet()); // K
		System.out.println(citizens.values()); // V

		//Efficient way to search for values based on a key.

	}

}

class Citizen {
	String name;
	Citizen(String name) {
		this.name = name;
	}
}