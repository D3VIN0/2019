package Rozdzial5;

class Dogcw5 {
    void bark(String s) {
        System.out.println(s + " string");
    }
    void bark(int i) {
        System.out.println(i + " int");
    }
    void bark(short s) {
        System.out.println(s + " Short");
    }
    void bark(double d) {
        System.out.println(d + " double");
    }
    void bark(String s, double d) {
        System.out.println("string double");
    }
    void bark(double d, String s) {
        System.out.println("double string");
    }}

public class Cw5 {
    public static void main(String[] args) {
        Dogcw5 dogi = new Dogcw5();
        dogi.bark("Hauuuuuuu");
        dogi.bark(1);
        dogi.bark((short)23);
        dogi.bark(23.0);
        dogi.bark("string", 23.0);
        dogi.bark(25.1, "string");
    }
}
