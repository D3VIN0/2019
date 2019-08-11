package Rozdzial6.access.dessert;

public class Cw5 {
    Cw5() {
        System.out.println("Obiekt Cw55 Created");
    }

    private void prywatna() {
        System.out.println("prywatna");
    }

    protected void chroniona() {
        System.out.println("chroniona");
    }

    public void publiczna() {
        System.out.println("publiczna");
    }

    void pakietowa() {
        System.out.println("pakietowa");
    }
}
