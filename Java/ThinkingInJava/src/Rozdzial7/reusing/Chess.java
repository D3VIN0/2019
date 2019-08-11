package Rozdzial7.reusing;

class Game {
    Game(int i) {
        System.out.println("Konstruktor klasy Game" + i);
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("Konstruktor klasy BoardGame" + i);
    }
}

public class Chess extends BoardGame{
    Chess() {
        super(11);
        System.out.println("Konstruktor klasy Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
