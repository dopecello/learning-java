# Java Access Modifiers

Access modifiers **let us give access to other files about the data**

There are 4 access modifiers in Java:
- `default`
- `public`
- `private`
- `protected`

## Default

No reserved word is used for default access. If you don't specify an access modifier, it is automatically set to default.
This means that the variable or method is accessible to all classes in the same package.

## Public

The first one where you have to put it in front of something.
They usually differe from defualt because you can tell in your IDE that it is public.
public helps you know that it is accessible from anywhere in the program... even outside the package.

For example: here I have 2 variables that are public in my `Access1.java` file:
```java
package access_control.package1;

public class Access1 {
    public int hours = 3;
    public int minutes = 47;
}
```

And I can access them from my `Access2.java` file the same way I would access them if they were default:
```java
package access_control.package1;

public class Access2 {
    public static void main(String[] args) {
        Access1 a = new Access1();
        System.out.println(a.hours);
        System.out.println(a.minutes);
    }
}
```
With public, I can actually access these variables from anywhere in the program. I can even access them from outside the package.
```java
package access_control.package2;

import access_control.package1.Access1; // import the class from another package 

public class Access3 {
    public static void main(String[] args) { // main method
        Access1 a = new Access1();
        System.out.println(a.hours);
        System.out.println(a.minutes);
    }
}
```
Here I am importing the class from another package and I can still access the variables.

## Private

Only accessible from within the class. You can't access it from anywhere else in the program.

## Protected

Only accessible from within the same package or from a subclass.
We can make Access3 a subclass of Access1 and then we can access the variables from Access1.
```java
package access_control.package2;

import access_control.package1.Access1; // import the class from another package 

public class Access3 extends Access1 {
    public static void main(String[] args) { // main method
        Access3 a = new Access3();
        System.out.println(a.hours);
        System.out.println(a.minutes);
    }
}
```
Here I am using the `extends` keyword to make Access3 a subclass of Access1. I still have to import Access1 because it is in a different package.

