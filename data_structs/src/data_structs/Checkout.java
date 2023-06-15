package data_structs;

import java.util.Queue;
import java.util.LinkedList;

public class Checkout {

	public static void main(String[] args) {
		Queue<Person> queue = new LinkedList<Person>();
		
		//this is like "pushing" in JS
		queue.offer(new Person());
		
		queue.peek(); //takes a look at the head, but doesn't remove.
		
		queue.poll(); //which retrieves and removes the head of the queue
		
		//called "popping" like JS.
		System.out.println(queue.poll());
		System.out.println(queue.size());
	}

}

class Person{}
