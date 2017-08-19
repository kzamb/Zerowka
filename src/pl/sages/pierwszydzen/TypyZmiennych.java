package pl.sages.pierwszydzen;

import java.util.Arrays;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class TypyZmiennych {
    public static void main(String[] args) {
        boolean prawda = true;
        boolean falsz = false;
        byte bajt =0; // +- 128
        short krotki =1; //+- 64000
        int calkowita =123; //2^31
        long duzaCalkowita = 500; //+-2^63

        float rzeczywista = 3.14f;
        double rzeczywistaDokladniejsza = 3.1415;

        char znak ='A';
        String napis ="Ala ma kota";

        int[] tablica = new int[10];
        tablica[0] = 42;
        tablica[1] = 7;


        System.out.println( Arrays.toString(tablica) );
    }
}
