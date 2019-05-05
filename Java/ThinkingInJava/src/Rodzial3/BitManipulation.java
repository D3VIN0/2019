package Rodzial3;
import java.util.*;

public class BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("maxpos", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("maxneg", maxneg);
        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);
        printBinaryInt("j", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);
        printBinaryInt("i ^ j", i ^ j);
        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i >> 5", i >> 5);
        printBinaryInt("(~i) >> 5", (~i) >> 5);
        printBinaryInt("i >>> 5", i >>> 5);
        printBinaryInt("(~i) >>> 5", (~i) >>> 5);

        long l = rand.nextLong();
        long m = rand.nextLong();
        printBinaryLong("-1L", -1L);
        printBinaryLong("+1L", +1L);
        long l1 = 9223372036854775807L;
        printBinaryLong("maxpos", l1);
        long l1n = -9223372036854775808L;
        printBinaryLong("maxneg", l1n);
        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong("m", m);
        printBinaryLong("l & m", l & m);
        printBinaryLong("l | m", l | m);
        printBinaryLong("l ^ m", l ^ m);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("(~l) >> 5", (~l) >> 5);
        printBinaryLong("l >>> 5", l >>> 5);
        printBinaryLong("(~l) >>> 5", (~l) >>> 5);

        // cw 13
        printBinaryChar("a", 'a');
        printBinaryChar("b", 'b');
        printBinaryChar("c", 'c');
        printBinaryChar("d", 'd');
    }


    static void printBinaryInt(String s, int i) {
        System.out.println(s + ". int: " + i + ". binarnie:\n " +
                Integer.toBinaryString(i));
    }
    static void printBinaryLong(String s, long l) {
        System.out.println(s + ". long: " + l + ". binarnie:\n " +
                Long.toBinaryString(l));
    }
    static  void printBinaryChar(String s, char c) {
        System.out.println(s + ". char: " + c + ". binarnie:\n " +
                (Integer.toBinaryString(c)));
    }
}
