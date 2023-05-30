package abstraction.Advanced;

public class ByThrees {
    int val;
    ByThrees() {
        val = 0;
    }
    public int getNext() {
        val += 3;
        return val;
    }
}
