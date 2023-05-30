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
        System.out.println("Dog Pooped!")
    }
}
```
We don't even need to invoke all of the methods that the interface has, but if we were to use a method from the interface, we would need to implement it somehow. To me, this makes way more sense, since I can imagine that I wouldn't want a bunch of abstract classes and keep track which methods need to be implemented and which ones are already implemented. 
