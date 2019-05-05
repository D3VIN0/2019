package Rodzial3;

class Tankz {
    float weight;
}

public class Cw2 {
    public static void main(String[] args) {
        Tankz t1 = new Tankz();
        Tankz t2 = new Tankz();
        t1.weight = (float) 1.5;
        t2.weight = (float) 2.5;
        System.out.println("1: t1.weight: " + t1.weight +
                " t2.weight: " + t2.weight);
        t1 = t2;
        System.out.println("1: t1.weight: " + t1.weight +
                " t2.weight: " + t2.weight);
        t1.weight = (float) 27.3;
        System.out.println("1: t1.weight: " + t1.weight +
                " t2.weight: " + t2.weight);
    }
} /**
 Output:
 1: t1.weight: 9 t2.weight:47
 2: t1.weight: 47 t2.weight: 47
 3: t1.weight: 27 t2.weight: 27
 */
