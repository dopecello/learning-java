# Abstraction

From what I understood in the [first tutorial on Youtube I found](https://www.youtube.com/watch?v=52frlN8webg), If I have a `abstract` class like this:

```java
abstract class Dog {
    String breed;
    public void bark() {
        System.out.println("Bark!"); //This is implemented code since there is code in the curly braces.
    }
    public abstract void poop(); //the method here alone doesn't do anything and needs to be implemented in another class
}

class Chihuahua extends Dog {
    public void poop() {
        System.out.println("Dog Pooped!!!");
    }
}
```

When routed to the `Main` function, these methods will be part of the overall idea of how a `Dog` is created. Each dog will bark the same, however, pooping will be implemented differently with each new `Dog` instance. 

I learned `interface` as well

```java
interface DogInterface {
    void bark();
    void poop(); 
}
```
An interface *infers* that everything inside is abstracted. Therefore if I were to try to write `System.out.println("Dog Pooped!!!");` on the `poop()` method inside of the interface, it would throw an error like "Abstract methods do not specify a body" or something similar. This is because we need to make another class that `implements` this interface, as shown:

```java
class Chihuahua implements DogInterface {
    public void bark() {
        System.out.println("Dog Bark ed!")
    }
    public void poop() {
        System.out.println("Dog Pooped!")
    }
}
```
We have to invoke all of the methods that the interface has, but if we were to use a method from the interface, we would need to implement it somehow. To me, this makes way more sense, since I can imagine that I wouldn't want a bunch of abstract classes and keep track which methods need to be implemented and which ones are already implemented. 

### Interface reference variables

You can create a varible of the interface type and have it reference objects that implement the interface:

```java
public class Main {
    public static void main(String[] args) {
        ByTwos b = new ByTwos();
        ByThrees t = new ByThrees();

        Series ob;

        for(int i = 0; i < 5; i++) {
            ob = b;
            System.out.println(ob.getNext());

            ob = t;
            System.out.println(ob.getNext());
        }
    }
}
```
When the loops are done, ob will switch to whatever class is connected to the interface through `ob`. This makes it so that you can run both methods at the same time in the `Main` class. Pretty cool! This strategy only works with elements that are defined in the interface only

### Variables in interfaces

```java
public interface Series {
    int MAX = 10;
    String ERRORMSG = "Cannot go above value: " + MAX;

    int getNext();
}
```
```java
public class ByTwos implements Series {
    int val;
    ByTwos(){
        val = 0;
    }
    public int getNext(){
        if (val >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            val += 2;
            return val;
        }
    }

    public int getPrev() {
        val -= 2;
        return val;
    }
}
```

In `ByTwos`, `getNext()` and `MAX` aren't even defined, but because we *implement* the `Series` interface, `ByTwos` has access to the values. However, in this case, ByTwos does not have access to `getPrev()` we can create a subclass of the interface that helps define this with a little bit of refactoring:

```java
public interface SeriesSub extends Series {
    int getPrev();
}
```
Now, lets implement series sub as it is *inheriting* the methods and variables from `Series`:

```java
public interface Series {
    int MAX = 10;
    String ERRORMSG = "Cannot go above value: " + MAX;

    int getNext();
}
```
```java
public class ByTwos implements SeriesSub {
    int val;
    ByTwos(){
        val = 0;
    }
    public int getNext(){
        if (val >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            val += 2;
            return val;
        }
    }

    public int getPrev() {
        val -= 2;
        return val;
    }
}
```

### Default Methods

You can define the body of the method inside the interface IF YOU WANT

```java
public interface Series {

    int MAX = 10;
    String ERRORMSG = "Cannot go above value: " + MAX;

    int getNext();

    default void printStuff() {
        System.out.println("Hey what's up?")
    }
}
```

By using the `default` modifier. We can create a body in the interface. This kind of defeats the purpose of an interface but it is possible if you know for sure this would be printing every time and you have a codebase structure relying mostly on interfaces.

You can also override the message by implementing the function in the `Main` class. This will mutate the message and print what you wrote in the particular class. If you don't write anything and just invoke the function, it will print only what the interface wrote in the first place.


### Static and Private methods in interfaces

```java
public interface Series {

    int MAX = 10;
    String ERRORMSG = "Cannot go above value: " + MAX;

    int getNext();

    static void printStuff() {
        System.out.println("Hey what's up?")
    }
}
```
```java
class Main {
    public static void Main(String[] args) {
        Series.printStuff()
    }
}  // Prints "hey what's up"
```

Here's an example on how you can implement a private method:
```java
public interface Series {

    int MAX = 10;
    String ERRORMSG = "Cannot go above value: " + MAX;

    int getNext();

    default void printStuff() {
        System.out.println("Hey what's up?")
        printMore();
    }

    private void printMore() {
        System.out.println("Hey what's up more?")
    }
}
```
```java
class Main {
    ByTwos b = new ByTwos();

    b.printStuff();
    // Prints "Hey what's up" + "Hey what's up more?"

}  
```


