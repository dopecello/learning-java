package polymorphism;

class Bird {
    public void sing() {
        System.out.println("Tweet tweet tweet");
    }
}

class Robin extends Bird {
    public void sing() {
        System.out.println("Chirp chirp chirp");
    }
}

class Pelican extends Bird {
    public void sing() {
        System.out.println("Squawk squawk squawk");
    }
}


public class Polymorph {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sing();
    }
}

// In this example, the `sing()` method is overridden in each subclass. This way each bird has it's own unique song.