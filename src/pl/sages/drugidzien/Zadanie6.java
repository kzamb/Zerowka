package pl.sages.drugidzien;

import java.util.Arrays;

/**
 * Created by vjdwmx on 8/20/2017
 */
public class Zadanie6 {

    public static void main(String[] args) {
        int[][] tab = {{3,8,16},
                       {1,22,28,24},
                       {3},
                       {41,42}};
        int min=tab[0][0];
        int max=tab[0][0];

        for(int[] t1:tab) {
            System.out.println(Arrays.toString(t1));
            for (int wart :t1) {
                min=Integer.min(min,wart);
                max=Integer.max(max,wart);
            }
        }
        System.out.println("MIN: "+min);
        System.out.println("MAX: "+max);
    }
}
