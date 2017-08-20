package pl.sages.drugidzien;

/**
 * Created by vjdwmx on 8/20/2017
 */
public class Zadanie5 {
    public static void main(String[] args) {
        String[] tab = {"Ala", "ma", "Asa"};
        //for
        for (int i = 0; i <tab.length ; i++) {
            System.out.println(tab[i]);
        }
        int idx=0;
        // while
        while(idx<tab.length) {
            System.out.println(tab[idx]);
        idx++;
        }

        //foreach
        for( String str : tab) {
        System.out.println(str);
        }


    }


}
