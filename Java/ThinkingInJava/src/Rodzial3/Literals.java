package Rodzial3;

public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // Literal szesnastkowy
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // literal szesnastkowy z duzymi literami
        System.out.println("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // Literal ósmkowy z zerem na początku
        System.out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // szesnastkowy literał max wartości char
        System.out.println("c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // szesnastkowy literał max wartości byte
        System.out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // szesnastkowy literal max wartosci short;
        System.out.println("s: " + Integer.toBinaryString(s));
        long n1 = 200L; // przyrostek wartosci long
        long n2 = 200l; // przyrostek wartosci long (mylacy)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F; // przyrostek wartosci float
        float f3 = 1f; // przyrostek wartosci float
        double d1 = 1d;
        double d2 = 1D;
        long l1 = 0x2F;
        System.out.println("l1: " + Long.toBinaryString(l1));
    }
}
