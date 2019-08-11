package Rozdzial6.access; // brak dostępu do konstruktora private

class Sundae {

private Sundae () {}

static Sundae makeASundae() {
    return new Sundae();
}
}

public class IceCream {
    public static void main(String[] args) {
        //!Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}