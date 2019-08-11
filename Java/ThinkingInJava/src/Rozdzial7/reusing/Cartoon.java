package Rozdzial7.reusing;

class Art {
    Art() {
        System.out.println("Konstruktor klasy Art");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Konstruktor klasy Drawing");
    }
}

public class Cartoon extends Drawing{
    public Cartoon() {
        System.out.println("Konstruktor klasy Cartoon");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
