package Rozdzial5;

public class VarArgType {
    static void f(Character...args) {
        System.out.print(args.getClass());
        System.out.println(" rozmiar " + args.length);
    }

    static void g(int...args) {
        System.out.print(args.getClass());
        System.out.println(" rozmiar " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
}
