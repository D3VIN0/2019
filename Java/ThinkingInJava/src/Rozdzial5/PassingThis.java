package Rozdzial5;

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Pyszne");
    }
}

class Peeler {
    static Apple peel (Apple apple) {
        return apple; // zwróć obrane
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args) {
        // apple wywołuje metodę Peeler.peel() będącą metodą zewnętrzną realizującą funkcję pomocniczą
        // dla Apple (np. metoda może mieć zastosowanie dla różnych klas
        // aby przekazać obiekt używamy słowa kluczowego this
        // this = ten obiekt/aktualny obiekt
        new Person().eat(new Apple());
    }
}
