package data_structs;

import java.util.Stack;

public class Casino {

	public static void main(String[] args) {
		Stack<Card> stack = new Stack<Card>();
		stack.push(new Card("A of Spades"));
		stack.push(new Card("K of Hearts"));
		stack.push(new Card("Q of Diamonds"));
		
		System.out.println(stack.pop().value);
		System.out.println(stack.peek().value);
		System.out.println(stack.pop().value);
	}

}

class Card {
	String value;
	public Card(String value) {
		this.value = value;
	}
}
