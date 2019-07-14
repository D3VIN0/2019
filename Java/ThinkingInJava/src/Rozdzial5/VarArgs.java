package Rozdzial5;

class A{}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{"raz", "dwa", "trzy"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}