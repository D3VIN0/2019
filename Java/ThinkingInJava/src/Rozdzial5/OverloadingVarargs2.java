package Rozdzial5;

public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("pierwszy");
    }

    static void f(Character... args) {
        System.out.println("drugi");
    }

    public static void main(String[] args) {
        //f(1, 'a');
        //f('a', 'b');
    }
}
