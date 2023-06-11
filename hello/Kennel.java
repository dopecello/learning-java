package hello;

public class Kennel {

	public static void main(String[] args) {
		Animal[] pets = new Animal[3];
		pets[0] = new Dog();
		pets[1] = new Cat();
		pets[2] = new Dog();

		for (Animal a : pets) {
			a.speak();
		}
	}
}

abstract class Animal {
	abstract void speak();
}

class Dog extends Animal {
	void speak() {
		System.out.println("Bark");
	}
}

class Cat extends Animal {
	void speak() {
		System.out.println("Meow");
	}
}