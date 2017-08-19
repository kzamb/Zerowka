package pl.sages.pierwszydzen.zadania;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class Zadanie4 {
    public static void main(String[] args) {

        double liczbaPi=0.0;
        double suma=0.0;
        double mnoznik=1.0;
        for (int n = 0; n <1000000 ; n++) {

            if (n%2==0) mnoznik=1.0;
            else mnoznik=-1.0;
            suma = suma + mnoznik / (2* n + 1);
        }
        liczbaPi=4 * suma;
        System.out.println(liczbaPi - Math.PI);
    }
}
