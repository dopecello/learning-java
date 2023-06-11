package access;

public class Person {
	Computer pc = new Computer(); //default modifier
	private int age;
	
	public void setAge(int val) {
		age = val;
	}
	
	public int getAge() {
		return age;
	}
	
	public void code() {
		pc.code();
	}

}

class House {
	public void tenant() {
		Person p = new Person(); //default, known as "package-private"
		p.setAge(15);
		p.pc = new Computer(); //accessed because of default modifier.
	}
}
