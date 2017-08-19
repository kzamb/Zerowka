package pl.sages.pierwszydzen.zadania;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab= {12,43,77,0,-34,-1,2,3,12};

        int liczbaElementowDodatnich=0;
        int sumaElementow1=0;

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
            if(tab[i]>0)
                liczbaElementowDodatnich++;
            if (tab[i]%3==0)
                sumaElementow1=sumaElementow1+tab[i];


        }

        System.out.println("Liczba elementow dodatnich: "+liczbaElementowDodatnich);
        System.out.println("Suma Elementow: "+sumaElementow1);

        double[] rzeczywiste = {2.5, 15.7,3.1415, 1.6018, 2.73, 1000.0};

        double suma=0;
        int licznik=0;

        for (int i = 0; i < rzeczywiste.length; i++) {
            if (rzeczywiste[i]>5 | rzeczywiste[i]<2) {
                suma=suma + rzeczywiste[i]*rzeczywiste[i];
                licznik++;
            }
        }
        System.out.println("Srednia kwadratów wynosi: "+ (suma/licznik));

        suma=0;
        licznik=0;
        for (int i = 0; i < rzeczywiste.length; i++) {
            suma=suma + rzeczywiste[i];
            licznik++;
        }
        System.out.println("Srednia wynosi: "+ (suma/licznik));



    }
}
