package pl.sages.pierwszydzen.sterowanie;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class Operatory {
    public static void main(String[] args) {
        int a = 10;
        a = 20;
        a = a+15;
        a = a - 8;

        int    b = a / 3; // dzielenie całkowite
        int    d = a / 4; // dzielenie całkowite
        double e = a / 4.0; // dzielenie rzeczywiste
        int    f = a % 3; // modulo z liczby

        System.out.println(1<<4); //przesunięcie bitowe
        System.out.println(Math.pow(4,4));

        System.out.println(true  | false);
        System.out.println(false | false);
        System.out.println(false & false);
        System.out.println(true & true);
        // operatory logiczne podwójne są leniwe
        System.out.println(false && czasochlonna());




    }

    public static boolean czasochlonna () {
        System.out.println("cos robie");
        return true;
    }
}
