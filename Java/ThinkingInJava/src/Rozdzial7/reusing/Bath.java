package Rozdzial7.reusing;

class Soap {
    private String s;
    Soap() {
        System.out.println("Soap()");
        s = "Skonstruowany";
    }
    public String toString() {return s;}
}

public class Bath {
    private String //inicjalizacja w miejscu definicji
    s1 = "Radosny" ,
    s2 = "Radosny" ,
    s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath() {
        System.out.println("Wewnątrz Bath()");
        s3 = "Uradowany";
        toy = 3.14f;
        castille = new Soap();
    }
    // Blok inicjalizacji egzemplarza
    {i = 47;}
    public String toString() {
        if(s4 == null) { // inicjalizacja leniwa
            s4 = "Uradowany";
        }
        return
                "s1 = " + s1 + "\n" +
                        "s2 = " + s2 + "\n" +
                        "s3 = " + s3 + "\n" +
                        "s4 = " + s4 + "\n" +
                        "i = " + i + "\n" +
                        "toy = " + toy + "\n" +
                        "castille = " + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}
