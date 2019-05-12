package Rozdzial5;

class Tree {
    int height;
    Tree() {
        System.out.println("Sadzenie sadzonki");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Tworzenie nowego drzewka. wysokiego na " +
                height + " metr(y)(ów)");
    }
    void info() {
        System.out.println("Drzewka ma " + height + " metr(y)(ów) wysokości");
    }
    void info(String s) {
        System.out.println(s + " drzewo ma " + height + " metr(y)(ów) wysokości");
    }
}

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("metoda przeciążaona");
        }
        new Tree(); // przeciazony konstruktor
    }
}
