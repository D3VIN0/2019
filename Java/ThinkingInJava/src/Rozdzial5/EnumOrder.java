package Rozdzial5;

public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values())
            System.out.println(s + ", miejsce " + s.ordinal());
    }
}
