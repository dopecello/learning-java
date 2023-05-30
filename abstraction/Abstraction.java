package abstraction;

interface DogInterface {
    public void eat();
    void poop(); // Cant have any implemented methods inside of an interface
}

abstract class Dog {
    String breed; 

    void eat() {
        System.out.println("Dog is eating"); // All dogs eat the same way
    }
    public abstract void poop(); //Have to implement your own poop method

    // Can have both abstract implemented methods inside of an abstract class
}

class Chihuahua implements DogInterface {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void poop() {
        System.out.println("Dog is pooping");
    }
}

public class Abstraction {
    public static void main(String[] args) {
      Chihuahua c = new Chihuahua();
        c.eat();
        c.poop();
    }
}

//Notes

// An abstract class helps make regular classes that you use. Can't use abstract classes like regular classes.