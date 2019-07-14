package Rozdzial5;

public class NewVarArgs {
    static void printArray(Object...args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // można przekazywać argumenty osobno
        printArray(new Integer(47), new Float(3.14),
                new Double(11.11));
        printArray(47, 3.14F, 11.11);
        printArray("raz", "dwa", "trzy");
        printArray(new A(), new A(), new A());
        // albo w tablicy
        printArray((Object[])new Integer[]{1, 2, 3, 4});
        printArray(); //pusta lista
    }
}
