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
