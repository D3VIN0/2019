package Rodzial3;
import java.util.*;

public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j to" + (i > j));
        System.out.println("i < j to" + (i < j));
        System.out.println("i >= j to" + (i >= j));
        System.out.println("i <= j to" + (i <= j));
        System.out.println("i == j to" + (i == j));
        System.out.println("i != j to" + (i != j));
        // W javie nie można traktować wartości bool jako int
        System.out.println("(i < 10) && (j < 10) to " +
                ((i < 10) && (j < 10)));
    }
}
