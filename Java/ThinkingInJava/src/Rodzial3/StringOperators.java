package Rodzial3;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z); // polaczy jak stringi
        System.out.println(x + " " + s); // Konwersja x na obiekt typu String
        s += "(zsumowane) = "; // Operator konkatenacji
        System.out.println(s + (x + y + z)); //(liczby int w nawiasie zostaną dodane jak int)
        System.out.println("" + x); // skrót od Integer.toString
    }
}
