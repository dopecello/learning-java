package inheritance;

public class Mouse2 extends Mouse {
    String texture = "matte";

    public static void leftClick() {
        System.out.println("Left Click!");
    }

    public static void rightClick() {
        System.out.println("Right Click!");
    }

    public static void connect() {
        System.out.println("Connected!");
    }
}