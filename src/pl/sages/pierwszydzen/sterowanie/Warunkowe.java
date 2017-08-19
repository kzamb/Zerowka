package pl.sages.pierwszydzen.sterowanie;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class Warunkowe {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("jestes pelnoletni");
        } else if (age < 18) {
            System.out.println("Jestes nieletni");
        }
    }
}
