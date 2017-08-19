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
        double srednia=(suma / licznik);
        System.out.println("Srednia wynosi: "+ srednia);

        double wariancja=0;
        double minimum=Double.MAX_VALUE;
        double maksimum=Double.MIN_VALUE;

        for (int i = 0; i < rzeczywiste.length; i++) {
            wariancja = wariancja + (rzeczywiste[i] - srednia)*(rzeczywiste[i] - srednia);
            minimum=Math.min(minimum,rzeczywiste[i]);
            maksimum=Math.max(maksimum,rzeczywiste[i]);
        }
        wariancja=Math.sqrt(wariancja);
        System.out.println("Wariancja wynosi: " + wariancja);
        System.out.println("Minumum wynosi: " + minimum);
        System.out.println("Maximum wynosi: " + maksimum);

        int half = rzeczywiste.length / 2;
        int rozmiar = rzeczywiste.length;
        System.out.print("{");
        for (int i = 0; i <half ; i++) {
            System.out.print(rzeczywiste[i] + rzeczywiste[rozmiar - i - 1]);
            if (i<half - 1)
                System.out.print(",");
        }
        System.out.print("}");






    }
}
