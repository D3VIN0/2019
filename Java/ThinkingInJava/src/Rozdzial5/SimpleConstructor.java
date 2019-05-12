package Rozdzial5;

class Rock {
    Rock() {
        // konstruktor
        System.out.print("Kamien ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
