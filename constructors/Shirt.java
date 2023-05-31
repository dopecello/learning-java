package constructors;

public class Shirt {
    public String color;
    public char size;

    Shirt() {
        color = "Red";
        size = 'M';
    }

    Shirt(String newColor, char newSize) {
        color = newColor;
        size = newSize;
    }
    
    public void putOn() {
        System.out.println("Shirt is on");
    }

    public void takeOff() {
        System.out.println("Shirt is off");
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setSize(char newSize) {
        size = newSize;
    }
}
