package abstraction.Advanced;

public class Main {
    public static void main(String[] args) {
        ByTwos b = new ByTwos();
        ByThrees t = new ByThrees();

        Series ob; 

        for(int i = 0; i < 5; i++) {
            ob = b;
            System.out.println(b.getNext());

            ob = t;
            System.out.println(t.getNext());
        }
    }
}
