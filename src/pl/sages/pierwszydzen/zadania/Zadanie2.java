package pl.sages.pierwszydzen.zadania;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class Zadanie2 {
    public static void main(String[] args) {
        double[] x = {1.2, 2.0, 1.3, 1.1, 3.2, 12.0, 7.3, 8.0};
        double[] y = {2.0, 3.4, 2.7, 4.4, 7.7, 11.9, 8.9, 10.2};

        double sumaX=0;
        double sumaY=0;
        double xsr=0;
        double ysr=0;
        double wx =0;
        double wy=0;
        double wxy=0;

        double r=0;

        for (int i=0;i<x.length;i++) {
            sumaX = sumaX + x[i];
            sumaY =sumaY + y[i];
        }

        xsr=sumaX / x.length;
        ysr=sumaY / y.length;

        for (int i = 0; i < x.length; i++) {
            wx = wx + (x[i] - xsr) * (x[i] - xsr);
            wy = wy + (y[i] - ysr) * (y[i] - ysr);
            wxy = wxy + (x[i] - xsr) * (y[i] - ysr);
        }
        wx=Math.sqrt(wx);
        wy=Math.sqrt(wy);

        r = wxy / (wx*wy);
        System.out.println("R = "+r);

    }
    public static double srednia (double[] x) {
        double suma=0.0;
        for (int i = 0; i <x.length ; i++) {
            suma=suma + x[i];
        }
        return suma / x.length;
    }
}
