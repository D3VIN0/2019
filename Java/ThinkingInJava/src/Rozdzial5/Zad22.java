package Rozdzial5;

import Rozdzial2.Zad2;

public class Zad22 {
    Banknot nominal;
    public Zad22(Banknot nominal) {this.nominal = nominal;}
    public void describe() {
        System.out.print("To jest banknot o nominale ");
        switch (nominal) {
            case PLN_10:
                System.out.println("10 ZŁ");
                break;
            case PLN_20:
                System.out.println("20 ZŁ");
                break;
            case PLN_50:
                System.out.println("50 ZŁ");
                break;
            case PLN_100:
                System.out.println("100 ZŁ");
                break;
            case PLN_200:
                System.out.println("200 ZŁ");
                break;
            case PLN_500:
                System.out.println("500 ZŁ");
                break;
        }
    }

    public static void main(String[] args) {
        Zad22
                maly = new Zad22(Banknot.PLN_10),
                sredni = new Zad22(Banknot.PLN_20),
                duzy = new Zad22(Banknot.PLN_500);
        maly.describe();
        sredni.describe();
        duzy.describe();
    }
}
