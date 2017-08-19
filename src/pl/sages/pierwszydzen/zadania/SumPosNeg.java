package pl.sages.pierwszydzen.zadania;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class SumPosNeg {

    public static void main(String[] args) {
        int[] arr = {};
        int[] wyn = new int[2];
        wyn = countPositivesSumNegatives(arr);

        System.out.println(wyn[0]);
        System.out.println(wyn[1]);

    }

    public static int[] countPositivesSumNegatives(int[] input)
    {
        int countP = 0;
        int sumN   = 0;

        for(int i =0; i<input.length;i++) {
            if (input[i]>=0) {
                countP++;
            } else {
                sumN=sumN + input[i];
            }
        }
        int[] res = new int[2];
        res[0]=countP;
        res[1]=sumN;
        return res;
    }

}
