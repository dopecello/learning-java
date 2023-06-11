package hello;

public class Farmer {

	public static void main(String[] args) {
		Pickle p = new Pickle();
		p.grow();
	}

}

//multiple inheritance is NOT supported in Java!!!

class Cucumber {
	double cals;
	public void grow() {}
}

class Pickle extends Cucumber {
	public Pickle() {
		cals = cals * 0.70;
	}
}

class Salad{}
