package pl.sages.pierwszydzen.zadania;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class PerfectSqueres {

    public static void main(String[] args) {
    long nextP =0;
        for (int i=0;i<100;i++) {
            nextP=findNextSquare(nextP);
            System.out.println(nextP);
        }
        System.out.println(findNextSquare(112));
    }

    public static long findNextSquare(long sq) {
        double dbase = Math.sqrt(sq);
        long base = (long) dbase;
        if ((dbase-base)!=0) {
                return -1;
           } else {
            base++;
            return base * base;
            }

    }
}
