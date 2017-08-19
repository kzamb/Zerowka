package pl.sages.pierwszydzen.zadania;

import java.util.Random;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class Zadanie5 {
    public static void main(String[] args) {
        Random random = new Random();
        int licznik=0;


        int k=100;
        for (int i = 0; i < k; i++) {
            double x = random.nextDouble()*2 - 1;
            double y = random.nextDouble()*2 - 1;
            if (x*x + y*y <=1) {
                licznik++;
            }
        }
        System.out.println(4.0*licznik/k);

        String xxx = "Alamik";
        int len = xxx.length();
        String yyy = "";
        if (len%2==0) {
            yyy = xxx.substring(len/2-1, len/2+1);
        }
        else {
            System.out.println("nieparzyste");
            yyy = xxx.substring(len/2, len/2+1);
        }
        System.out.println(len);
        System.out.println(xxx);
        System.out.println(yyy);

    }
}
