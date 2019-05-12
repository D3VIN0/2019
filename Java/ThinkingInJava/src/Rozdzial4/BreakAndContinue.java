package Rozdzial4;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100;i++) {
            if (i == 99) break; // przerwanie pętli for
            if (i % 9 != 0) continue; // następna iteracja
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        // pętla infinity
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break; // przerwanie pętli
            if (i % 10 != 0) continue; // na początek pętli
            System.out.print(i + " ");
        }
    }
}
