package pl.sages.drugidzien;

/**
 * Created by vjdwmx on 8/20/2017
 */
public class Zadanie7 {
    public static int pozycjaPodzielnejPrzez(int[] tab, int x) {
        int i=0;
        for (i=1; i<tab.length;i++) {
            if (tab[i]%x==0) break;
        }
        if (i==tab.length&(tab[i-1]%x!=0)) {
            return -1;
        } else return i;
    }

    public static void main(String[] args) {
    int[] tab = {1,2,3,4,5,6,7,8,9,11};

        System.out.println(pozycjaPodzielnejPrzez(tab,12));

    }
}
