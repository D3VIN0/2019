package Rodzial3;

class Dog {
    String name;
    String says;
    Dog(String name) {
        this.name = name;
    }

    void say() {
        System.out.println(name + " says " + says);
    }
}

public class Cw5 {
    public static void main(String[] args) {
        Dog spot = new Dog("Spot");
        Dog scruffy = new Dog("Scruffy");
        spot.says = "Hau";
        scruffy.says = "Wrrr";
        spot.say();
        scruffy.say();

        System.out.println(spot.equals(scruffy));
        System.out.println(spot == scruffy);
    }
}
