package Rozdzial4;

public class Cw2 {
    public static void main(String[] args) {
        for (int i = 1;i < 26;i++) {
            int a = (int)(Math.random() * 100);
            System.out.println("pierwsza liczba " + a);
            int b = (int)(Math.random() * 100);
            System.out.println("Druga liczba " + b);
            if(a > b) {
                System.out.println(a + " jest większe od " + b);
            } else {
                System.out.println(b + " jest większe od " + a);
            }
        }
    }
}
