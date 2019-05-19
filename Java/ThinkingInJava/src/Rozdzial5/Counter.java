package Rozdzial5;

public class Counter {
    int i;
    Counter() {
        System.out.println("wartość początkowa " + i);
        i = 7;
        System.out.println("wartość po konstruktorze " + i);
    }

    public static void main(String[] args) {
        Counter c = new Counter();
    }
}
