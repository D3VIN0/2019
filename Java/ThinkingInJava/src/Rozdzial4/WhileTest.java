package Rozdzial4;

public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println(result + ". ");
        return result;
    }

    public static void main(String[] args) {
        while (condition())
            System.out.println("Wewnątrz 'while'");
        System.out.println("Poza 'while'");
    }
}
