package Rozdzial5;

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;
    { // blok inicjalizacji egzemplarza klasy
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("Zainicjalizowano Mug1 i Mug2");
    }
    Mugs() {
        System.out.println("Mugs()");
    }
    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        System.out.println("Wewnątrz main");
        new Mugs();
        System.out.println("new Mugs() - zakończone");
        new Mugs(1);
        System.out.println("new Mugs(1) - zakończone");

    }
}
