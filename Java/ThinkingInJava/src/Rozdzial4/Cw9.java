package Rozdzial4;

import java.util.ArrayList;

public class Cw9 {
    static int fib(int n) {
        if ((n == 1) || (n==2)) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    static void fibonacci(int liczba) {
        for(int i=1;i <= liczba;i++) {
            System.out.print(fib(i) + " ");
        }
    }
    public static void main(String[] args) {
       fibonacci(5);
    }
}

// 1 1 2 3 5
