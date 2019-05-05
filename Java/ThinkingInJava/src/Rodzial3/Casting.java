package Rodzial3;

public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i; // "Poszerzenie", więc bez faktycznej potrzeby rzutowania
        lng = i;
        long lng2 = (long) 200;
        lng2 = 200;
        // "Zwężanie"
        i = (int)lng2; // konieczne rzutowanie
    }
}
