package Rozdzial5;

public class Zad19 {
    static void f(String... args) {
        System.out.println("pierwszy");
    }

    public static void main(String[] args) {
        f("abc");
        f(new String[] {"abc", "def"});
    }
}
