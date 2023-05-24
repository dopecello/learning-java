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

## But, what is composition?

Composition is when a class has a reference to another class. This is often done through the use of instance variables. The main difference between composition and inheritance is that composition is used to share code between classes, while inheritance is used to share code between a parent and child class. There is a debate about which one is better, but it really is up to the preference of the programmer and the overall goals of a project. Composition usually leads to flexible code, while inheritance usually leads to more rigid code. Also, composition leads to less nested bugs and code duplication, while inheritance leads to more nested bugs and code duplication.

Here is an example of composition:

```java
class Animal {
    public void eat() {
        System.out.println("I can eat!");
    }
}

////////////////////////////////////////
// Tiger.java
////////////////////////////////////////

class Tiger {
    private Animal animal = new Animal();
    
    public void roar() {
        System.out.println("I can roar!");
    }
    
    public void eat() {
        animal.eat();
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

## Liskov's Substitution Principle

The Liskov substitution principle states that if S is a subtype of T, then objects of type T should be replaceable with objects of type S without affecting the correctness of the program. In other words, a program that uses a base type should be able to work correctly when an instance of any of its derived types is substituted in place of the base type.

Liskov's substitution principle, also known as the Liskov substitution principle (LSP), is a fundamental principle in object-oriented programming (OOP) named after Barbara Liskov. It is one of the SOLID principles, a set of principles intended to guide software design and promote maintainability, flexibility, and reusability.

To adhere to the Liskov substitution principle, the following conditions must be met:

- Subtyping Requirement: Subtypes must be substitutable for their base types. Anywhere a base type is used, a subtype should be able to replace it without violating the expected behavior of the program.

- Precondition Strengthening: Preconditions (input conditions) of the base type's methods should not be strengthened in the subtype. The subtype may relax the preconditions but cannot make them more restrictive.

- Postcondition Weakening: Postconditions (output conditions) of the base type's methods should not be weakened in the subtype. The subtype may strengthen the postconditions but cannot weaken them.

- Behavioral Inheritance: The subtype should maintain the same behavior as the base type. It should adhere to the same contract and satisfy the same properties and constraints expected from the base type.

By following the Liskov substitution principle, developers can design more modular and flexible code. It enables code reuse, polymorphism, and enables the use of inheritance hierarchies in a consistent and reliable manner. Violations of the Liskov substitution principle can lead to unexpected behavior, violated assumptions, and difficulties in maintaining and extending software systems.

Example 1: Applying Liskov's Substitution Principle

```java
// Base class
class Shape {
    protected int area;

    public int getArea() {
        return area;
    }
}

// Derived class
class Rectangle extends Shape {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
        calculateArea();
    }

    public void setHeight(int height) {
        this.height = height;
        calculateArea();
    }

    private void calculateArea() {
        area = width * height;
    }
}

// Derived class
class Square extends Shape {
    private int side;

    public void setSide(int side) {
        this.side = side;
        calculateArea();
    }

    private void calculateArea() {
        area = side * side;
    }
}

// Client code
class Client {
    public void printArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }
}

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        client.printArea(rectangle);

        Square square = new Square();
        square.setSide(5);
        client.printArea(square);
    }
}
```

In this example, we have a base class `Shape` with a derived class `Rectangle` and another derived class `Square`. Both derived classes inherit from `Shape` and implement the `getArea()` method. The `Rectangle` class calculates the area based on its width and height, while the `Square` class calculates the area based on its side length. The `Client` class can print the area of any shape passed to it.

This example adheres to Liskov's substitution principle because both the `Rectangle` and `Square` classes can be substituted for the base class `Shape` without affecting the correctness of the program. They maintain the same behavior as the base class by implementing the `getArea()` method appropriately.

Example 2: Violating Liskov's Substitution Principle

```java
// Base class
class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

// Derived class
class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly.");
    }
}

// Client code
class Client {
    public void makeBirdFly(Bird bird) {
        bird.fly();
    }
}

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Bird bird = new Bird();
        client.makeBirdFly(bird); // Bird flies

        Penguin penguin = new Penguin();
        client.makeBirdFly(penguin); // Throws UnsupportedOperationException
    }
}
```

In this example, we have a base class `Bird` with a derived class `Penguin`. The `Bird` class has a `fly()` method that prints "Flying...". However, penguins are flightless birds, so the `Penguin` class overrides the `fly()` method and throws an exception indicating that penguins cannot fly.

This example violates Liskov's substitution principle because the `Penguin` class cannot be substituted for the base class `Bird` without affecting the correctness of the program. The client code expects all birds to be able to fly, but when a `Penguin` object is passed, it throws an exception. This violates the behavioral inheritance and leads to unexpected behavior when substituting a `Penguin` for a `Bird`.

It's important to note that Liskov's substitution principle applies to both inheritance and polymorphism in object-oriented programming. It ensures that derived classes can be used interchangeably with their base classes, providing flexibility and reusability in code design.