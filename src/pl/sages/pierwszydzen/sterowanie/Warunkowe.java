package pl.sages.pierwszydzen.sterowanie;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class Warunkowe {
    public static void main(String[] args) {
       ifElse();

    }


    public static void ifElse () {
        int age = 19;
        if (age >= 18) {
            System.out.println("jestes pelnoletni");
        } else if (age < 18) {
            System.out.println("Jestes nieletni");
        }
    }
    public static void  switchExample () {
    int apples = 3;
    switch (apples) {
        case 0:
            System.out.println("nie masz jabłek");
            break;
        case 1:
            System.out.println("mas 1 jabłko");
            break;
        case 2:
            System.out.println("mas 2 jabłka");
            break;
        case 3:
            System.out.println("mas 2 jabłka");
            break;
        default:
            System.out.println("masz więcej jabłek");
       }
    }


}
