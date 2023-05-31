package constructors;

public class Main {
    public static void main(String[] args) {
        Shirt s = new Shirt("White", 'L');
        System.out.println("Shirt color: " + s.color);
        System.out.println("Shirt size: " + s.size);
        s.putOn();
        s.takeOff();
    }
}
