package Rozdzial5;

class obiektcw4 {
    obiektcw4() {
        System.out.println("Stworzono obiekt");
    }
    obiektcw4(String k) {
        System.out.println("Stworzono obiekt - " + k);
    }
}

public class Cw4 {
    public static void main(String[] args) {
        obiektcw4 o = new obiektcw4("komunikat obiektu pierwszego");
    }
}
