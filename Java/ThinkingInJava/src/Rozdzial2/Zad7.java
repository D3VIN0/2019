package Rozdzial2;

public class Zad7 {
    static int zmiennaStatyczna = 0;

    void increment() {
        zmiennaStatyczna++;
    }

    public static void main(String[] args) {
        Zad7 obiekt1 = new Zad7();
        Zad7 obiekt2 = new Zad7();
        obiekt1.increment();
        obiekt2.increment();
        System.out.println(obiekt1.zmiennaStatyczna);
        System.out.println(obiekt2.zmiennaStatyczna);
        obiekt1.increment();
        System.out.println(obiekt1.zmiennaStatyczna);
        System.out.println(obiekt2.zmiennaStatyczna);
    }
}
