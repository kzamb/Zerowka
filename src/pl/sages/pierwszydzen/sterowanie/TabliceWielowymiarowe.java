package pl.sages.pierwszydzen.sterowanie;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by vjdwmx on 8/20/2017
 */
public class TabliceWielowymiarowe {

    public static void main(String[] args) {
        int[][] tab = new int[3][2];
        tab[0][0]=1;
        tab[0][1]=1;
        tab[1][0]=1;
        tab[1][1]=1;
        tab[2][0]=1;
        tab[2][1]=1;

        int[][] tab2= new int[3][];
        tab2[0]=new int[5];
        tab2[1]=new int[2];
        tab2[2]=new int[25];

        int[][] tab3 = { {1,1},{3,4},{5,6}};

        System.out.println("tabloca2");
        for(int i=0; i<tab2.length;i++) {
            int[] ints = tab3[i];
            System.out.println(Arrays.toString(ints));
        }

    }
}
