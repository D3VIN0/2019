package Rozdzial4;

public class ListCharacters {
    public static void main(String[] args) {
        for(char c = 0; c < 128; c++)
            if(Character.isLowerCase(c))
                System.out.println("wartość: " + (int)c +
                        " znak: " + c);
    }
}
