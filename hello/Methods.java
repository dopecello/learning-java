package hello;

public class Methods {

	public static void main(String[] args) {
		Methods example = new Methods();
		int returned = example.go();
		int value = Methods.go(5);
		System.out.println(returned);
		System.out.println(value);

	}
	
	public int go() {
		return 11;
	}
	public static int go(int x) {
		return x;
	}
	
}
