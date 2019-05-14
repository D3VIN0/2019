package Rozdzial5;

public class Leaf {
    int i = 0;
    Leaf increment() {
        i++;
        return this; // zwraca obiekt Leaf dzięki temu można na referencji wywołać kilka metod
    }
    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
