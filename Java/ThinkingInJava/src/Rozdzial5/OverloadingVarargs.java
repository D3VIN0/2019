package Rozdzial5;

public class OverloadingVarargs {
    static void f(Character... args) {
        System.out.print("pierwszy");
        for (Character c : args) {
            System.out.print(" " + c);
        }
        System.out.println();
    }

    static void f(Integer... args) {
        System.out.println("drugi");
        for (Integer i : args) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    static void f(Long... args) {
        System.out.println("trzeci");
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(2, 1);
        f(0);
        f(0L);
        //! f(); // Niejednoznaczność uniemożliwi kompliację
    }
}
