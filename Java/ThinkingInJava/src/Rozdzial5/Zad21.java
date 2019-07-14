package Rozdzial5;

public class Zad21 {
    public static void main(String[] args) {
        for(Banknot b: Banknot.values())
            System.out.println(b + ", pozycja " + b.ordinal());
    }
}
