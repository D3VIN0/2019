package Rozdzial4;

public class Cw6 {
    static int test(int testval, int begin, int end) {
        if ((testval >= begin) && (testval <= end))
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(10,5,10));
        System.out.println(test(5,1,4));
        System.out.println(test(5,5,5));
    }
}
