package hello;

public class Override {

	public static void main(String[] args) {
		Poppable obj = new Balloon();
		obj.pop();

	}

}

class Poppable {
	public void pop() {
		System.out.println("Pop");
	}
}
class Balloon extends Poppable {
	public void pop() {
		System.out.println("POP!");
	}
}
class Bubble extends Poppable {
	public void pop() {
		System.out.println("p");
	}
}

