package Rozdzial5;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)]; //ustalamy rozmiar tablicy
        System.out.println("rozmiar a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
