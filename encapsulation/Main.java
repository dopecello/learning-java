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
