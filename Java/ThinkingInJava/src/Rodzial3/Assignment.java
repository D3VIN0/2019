package Rodzial3;

class Tank {
    int weight;
}

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.weight = 9;
        t2.weight = 47;
        System.out.println("1: t1.weight: " + t1.weight +
                " t2.weight: " + t2.weight);
        t1 = t2;
        System.out.println("1: t1.weight: " + t1.weight +
                " t2.weight: " + t2.weight);
        t1.weight = 27;
        System.out.println("1: t1.weight: " + t1.weight +
                " t2.weight: " + t2.weight);
    }
} /**
 Output:
 1: t1.weight: 9 t2.weight:47
 2: t1.weight: 47 t2.weight: 47
 3: t1.weight: 27 t2.weight: 27
 */
