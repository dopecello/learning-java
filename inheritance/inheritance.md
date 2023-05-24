# Inheritance

Inheritance is when a class inherits the properties of another class. The class that inherits is called the child class, and the class that is inherited from is called the parent class.

Most codebases have a lot of inheritance, and it is often used to share code between classes. However, inheritance is often overused, and it can lead to a lot of problems due to largely nested bugs and code duplication. This is why it is often recommended to use composition over inheritance.

## Example

```java
class Animal {
    public void eat() {
        System.out.println("I can eat!");
    }
}

////////////////////////////////////////
// Tiger.java
////////////////////////////////////////

class Tiger extends Animal {
    public void roar() {
        System.out.println("I can roar!");
    }
}

////////////////////////////////////////
// Main.java
////////////////////////////////////////

class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.roar();
    }
}
``` 

In this example, Tiger is the subclass of Animal. When we run Tiger in the Main class, we can see that it can eat and roar. This is because Tiger inherits the eat() method from Animal, and it has its own roar() method. 

