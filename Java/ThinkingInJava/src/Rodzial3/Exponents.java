package Rodzial3;

// e oznacza "10 do potęgi ..."
public class Exponents {
    public static void main(String[] args) {
        // Małe i wielkie e mają to samo znaczenie
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f; // 1,39 * 10 do potęgi -43
        System.out.println(expFloat);
        double expDouble = 47e47d; // d jest opcjonalne
        double expDouble2 = 47e47; // automatyczna konwersja na double
        System.out.println(expDouble);

        //cw 9
        System.out.println("Float MAX: " + Float.MAX_VALUE);
        System.out.println("Double MAX: " + Double.MAX_VALUE);


    }
}
