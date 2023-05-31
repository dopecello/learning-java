# Polymorphism

> Many forms

In terms of the Java programming language, Polymorphism is defined as the ability of any object in a `class` to perform a particular task in multiple methods.

In the example within the code, I used an example of polymorphism via inheritance:

```java
package polymorphism;

class Bird {
    public void sing() {
        System.out.println("Tweet tweet tweet");
    }
}

class Robin extends Bird {
    public void sing() {
        System.out.println("Chirp chirp chirp");
    }
}

class Pelican extends Bird {
    public void sing() {
        System.out.println("Squawk squawk squawk");
    }
}


public class Polymorph {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sing();
    }
}
```

In the `main` class, `Polymorph`, if I were to change the constructor, ie: `Robin r = new Robin();`, the `sing()` method will be overriden based on what we implemented within each class. In this case, `Robin` will print "Chirp chirp chirp".

**Some characteristics of Polymorphism**:
- The functionality of a method behaves differently in different situations.
- The beahvior of a method depends on the data
- Polymorphism is mainly used to implement inheritance
- It allows the same name for a member or method in a class with different types.
- Polymorphism supports implicit type conversion

There are two types of polymorphism in Java: **Run-time** Polymorphism and **Compile-Time** Polymorphism.

## Compile-time Polymorphism

Compile-Time Polymorphism gets executed during the compilation stage. Here, the overloading method gets resolved in this stage.

**Method-Overloading** is part fo this type of polymorphism. If we look back to the example above, the method `sing()` is being called with no arguments. However, if I added the same method, but with an argument, the behavior would be different, since I am **overloading** the method that contains no arguments, which then defaults over to the method which *does* contain an argument.

```java
package polymorphism;

class Bird {
    public void sing() {
        System.out.println("Tweet tweet tweet");
    }
}

class Robin extends Bird {
    public void sing() {
        System.out.println("Chirp chirp chirp");
    }

    public void sing(String s) {
        System.out.println("Chirp chirp chirp" + s);
    }
}

public class Polymorph {
    public static void main(String[] args) {
        Robin b = new Robin();
        b.sing(", Bitch!");
    }
}

// Will print, "Chirp chirp chirp, Bitch!"
```

## Run-Time Polymorphism

In Java, Run=Time Polymorphism gets handled during the program execution stage. Here, the overriding method gets resolved in the execution stage.

The term `super` is a predefined keyword in Java that is used to refer to the immediate parent class object or mehtod defined in the program. In this procedure, whenever you create an instance or subclass, automatically, an instance of the parent class is also created that will be implicitly referred by the super reference variable. This will trigger at **run-time**

Here is a code example:

```java
package polymorphism;

class Bird {
    public void sing() {
        System.out.println("Tweet tweet tweet");
    }
}

class Robin extends Bird {
    public void sing() {
        System.out.println("Chirp chirp chirp");
    }

    public void sing(String s) {
        System.out.println("Chirp chirp chirp" + s);
        super.sing(); // here we use super which refers back to the parent class, Bird.
    }
}

public class Polymorph {
    public static void main(String[] args) {
        Robin b = new Robin();
        b.sing(", Bitch!");
    }
}

// Will print, "Chirp chirp chirp, Bitch!", "Tweet tweet tweet"
```
So, just to compare and contrast the two using a table:

| Compile-Time Polymorphism | Run-Time Polymorphism |
| ------------------------- | --------------------- |
| Method call is handled by the compiler itself | Method call cannot be handled by the compiler in the execution stage |
| Compile-Time polymorphism is less flexible as it needs to handle all method calls at compile-time | Run-Time poly is more flexible becuase everything is at run-time|
| The execution period for compile-time poly is less | The execution period for run-time poly is more |
| Integration the right method call with the right method is done at compile-time | Integration the right method call wiht the right method is done at run-time |
| Occurs during Method Overloading, *and rarely,* Operator Overloading | Occurs during Method Overriding


Some benefits of poly are that programmers can re-use the code they made more efficiently, it supports a single variable name for multiple datatypes, and it also reduces coupling between different functionalities.

Some disadvantages are that polymorphism can raise performance issues in real-time, it reduces the readability of code in Java, and it might be difficult to implement according to experienced programmers. 