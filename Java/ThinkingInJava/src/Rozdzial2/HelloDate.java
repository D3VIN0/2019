package Rozdzial2;

import java.util.*;

/** Pierwszy program przykładowy z 'Thinking in Java'.
 * Wyświetla ciąg i dzisiejszą datę
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloDate {
    /** Punkt wejścia klasy i aplikacji
     * @param args tablica ciągów argumentów do wywołania
     * @throws exceptions nie zgłasza wyjątków
     */

    public static void main(String[] args) {
        System.out.println("Witaj, dzisiaj jest: " +
                new Date());
    }
}/* Output (55% match)
    Witaj, dzisiaj jest: Fri May 03 13:30 CET 2019
    *///:~
