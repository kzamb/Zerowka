package pl.sages.pierwszydzen.zadania;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class SumOfOdd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int suma=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i]%2!=0) {
                suma=suma + (arr[i]*arr[i]*arr[i]);
            }
        }
        System.out.println(suma);
    }

}
