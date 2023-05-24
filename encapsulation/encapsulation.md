# Encapsulation

We are encapsulating the data and the methods that operate on the data into a single unit. This is called encapsulation.

One interesting thing that I discovered early in the YouTube video I learned to study encapsulation is this example:

```java
package encapsulation; // This is the package name or the folder name

public class Main {
  public static void main(String[] args) {
    
    Student s = new Student();
    s.name = "John"; // These two definitions are a bad practice in OOP because they should be encapsulated.
    s.age = 24; // -------^
    System.out.println(s.name);
    System.out.println(s.age);

  }
}
```

So, the above code is a bad practice in OOP because the data and the methods that operate on the data are not encapsulated. The data and the methods that operate on the data should be encapsulated into a single unit. This is called encapsulation.

I made a student class and encapsulated the data and the methods that operate on the data into a single unit.

```java
package encapsulation;

public class Student { /*Every class has attributes inside them.*/
    
    String name; /*These are what we call instance variables*/
    int age;

    public void setName(String newName) { /*These are what we call instance methods*/
        name = newName;
    }

}
```

Now when we refactor the Main file, you'll see that it has access to the instance method `setName` from the `Student` object

```java
package encapsulation; // This is the package name or the folder name

public class Main {
  public static void main(String[] args) {
    
    Student s = new Student();
    s.setName("John"); // Here is where we are calling the instance method from Student
    System.out.println(s.name);
    
  }
}
```

The point of encapsulation **is to abstract the variables from the user to make it simpler to use the object.** The user doesn't need to know how the object works, they just need to know how to use it. We will go ahead and make the instance variables private in this example.

```java
package encapsulation;

public class Student { /*Every class has attributes inside them.*/
    
    private String name; /*These are what we call instance variables*/
    private int age;

    public void setName(String newName) { // This is a setter method
        name = newName;
    }
    public String getName() { // This is a getter method
        return name;
    }

}
``` 
Now we can refactor the Main file to use the getter method to get the name of the student.

```java
package encapsulation; // This is the package name or the folder name

public class Main {
  public static void main(String[] args) {

    Student s = new Student();
    s.setName("John");
    System.out.println(s.getName());

  }
}
```

We can do the same thing with the age variable.

```java
/////////////////////////////
// Student.java
/////////////////////////////
package encapsulation;

public class Student { /*Every class has attributes inside them.*/
    
    private String name; /*These are what we call instance variables*/
    private int age;

    public void setName(String newName) { // This is a setter method
        name = newName;
    }
    public String getName() { // This is a getter method
        return name;
    }

    // For age
    public void setAge(int newAge) {
        age = newAge;
    }
    public int getAge() {
        return age;
    }
}

/////////////////////////////
// Main.java
/////////////////////////////

package encapsulation; // This is the package name or the folder name

public class Main {
  public static void main(String[] args) {

    Student s = new Student();
    s.setName("John");
    s.setAge(20);
    System.out.println(s.getName());
    System.out.println(s.getAge());
  }
}
```
 And we're done! 99% the getter and setter methods will look exactly like the ones here in future projects.

# Notes from the comment section

> "I think you should have mentioned that the reason we use getters and setters is to protect the data from being changed by the user. If we didn't use getters and setters, the user could change the data to anything they want. For example, if we didn't use getters and setters, the user could change the age to -1000. But if we use getters and setters, we can make sure that the age is always positive.﻿" - [Sahil](https://www.youtube.com/channel/UC7rNzgC2fEBVpb-q_acpsmw)

> "Useful to note: most setter methods would include validation logic and checks. For example, check that age is greater than X for a student." - [Mr Blobby](https://www.youtube.com/watch?v=cU94So54cr8)

> "Also setters can be used for validating the data type. If you send a int to a String your program crashes but using the setters you can catch that and throw an exception or perform additional actions on the passed value to reformat before storing the value." - [Max D](https://www.youtube.com/watch?v=cU94So54cr8)

