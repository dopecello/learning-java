package data_structs;

import java.util.ArrayList;

public class ArrayA {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(2);
		list.add("ABC");
		list.add("DEF");
		
		//access
		System.out.println(list.get(2));
		list.remove(2);
		list.size();
		
		System.out.println(list);
		
		for(String item : list) {
			System.out.println(item);
		}
	}

}
