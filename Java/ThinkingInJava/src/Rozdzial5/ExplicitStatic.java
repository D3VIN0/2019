package Rozdzial5;
/*
* Statyczne inicjalizatory klasy Cup wykonują się gdy nastąpi odwołanie do statycznego obiektu Cup1 lub jeśli wiersz ten
* zostanie umieszczony w komentarzu
* */
class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Wewnątrz main()");
        Cups.cup1.f(99);
    }
}
