package Rozdzial7.reusing;

import net.mindview.simple.List;

class Shape {
    Shape(int i) {
        System.out.println("Konstruktor figury");
    }
    void dispose() {
        System.out.println("Usuwanie figury");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Rysowanie okręgu");
    }
    void dispose() {
        System.out.println("Wymazywanie okręgu");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Rysowanie trójkąta");
    }
    void dispose() {
        System.out.println("Wymazywanie trójkąta");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Rysowanie linii: " + start + ". " + end);
    }
    void dispose() {
        System.out.println("Wymazywanie linii: " + start + ", " + end);
        super.dispose();
    }
}

public class CADSystem extends Shape{
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length;j++) {
            lines[j] = new Line(j, j * j);
        }
            c = new Circle(1);
            t = new Triangle(1);
        System.out.println("Konstruktor łączony");
        }
        public void dispose() {
            System.out.println("CADSystem dispose()");
            t.dispose();
            c.dispose();
            for (int i = lines.length - 1; i >= 0; i--) {
                lines[i].dispose();
            }
            super.dispose();
        }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            //
        } finally {
            x.dispose();
        }
    }
    }
