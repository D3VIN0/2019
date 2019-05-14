package Rozdzial5;

// Wywoływanie konstruktorów za pośrednictwem referencji this

public class Flower {
    int petalCount = 0;
    String s = "wartość początkowa";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Konstruktor z argumentem int. petalCount= "
        + petalCount);
    }

    Flower(String ss) {
        System.out.println("Konstruktor z argumentem String. s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals); // wywołanie konstruktora z 1 argumentem
        //! this(s) - nie można wywołać 2!
        this.s = s; // kolejne zastosowanie this - odwołanie do zmiennej globalnej klasy
        System.out.println("Argumenty String i int");
    }

    Flower() {
        this("hej", 47); // wywołanie konstruktora musi być 1 rzeczą jaką robimy w konstruktorze
        System.out.println("konstruktor domyślny (bez arg)");
    }

    void printPetalCount() {
        //! this(11); // nie w metodzie nie będącej konstruktorem!
        System.out.println("petalCount = " + petalCount + " s = "+ s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
