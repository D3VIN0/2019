package Rozdzial5;

public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) { this.degree = degree;}
    public void describe() {
        System.out.print("To burrito jest ");
        switch (degree) {
            case NOT:
                System.out.println("łagodne");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("trochę pikantne");
                break;
            case HOT:
            case FLAMING:
                default:
                    System.out.println("trochę za ostre");
        }
    }

    public static void main(String[] args) {
        //tworzenie obiektów jednego typu bez powtarzania
        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
