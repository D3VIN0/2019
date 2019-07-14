package Rozdzial5;

public class OverloadingVarargs3 {
    static void f(float i, Character... args) {
        System.out.println("pierwszy");
    }

    static void f(char c, Character... args) {
        System.out.println("drugi");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
}
