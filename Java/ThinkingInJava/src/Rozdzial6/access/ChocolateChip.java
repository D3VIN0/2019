package Rozdzial6.access;
import Rozdzial6.access.dessert.*;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("Konstruktor ChocolateChip");
    }
    public void chomp() {
         bite(); // brak dostępu
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
