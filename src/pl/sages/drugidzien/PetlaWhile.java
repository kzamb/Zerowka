package pl.sages.drugidzien;

/**
 * Created by vjdwmx on 8/20/2017
 */
public class PetlaWhile {
    public static void main(String[] args) {

    }



    public static void whileLoop() {
        int age=0;
        while (age<18) {
            System.out.println("jesteś nieletni, masz " + age + " lat");
            age++;
        }
    }

    public static void whileLoop2() {
        String text = "Ala ma kota, a kot ma psa i chomika";
        int currentIndex=0;
        char currentChar = text.charAt(currentIndex);

        while (currentChar!='c') {
            System.out.println("obecny znak '" + currentChar + "'");
            currentIndex++;
            currentChar=text.charAt(currentIndex);
        }
    }

    public static void doWhileLoop() {
        String text = "Ala ma kota, a kot ma psa i chomika";
        int currentIndex=0;
        char currentChar = text.charAt(currentIndex);

        do {
            System.out.println(currentChar);
            currentIndex++;
        } while (currentChar !='A');
    }

    public static void whileFor() {
        int k=10;
        for(int i=0; i<k;i++) {

        }

    }

}
