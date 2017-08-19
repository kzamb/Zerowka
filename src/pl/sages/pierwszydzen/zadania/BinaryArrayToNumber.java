package pl.sages.pierwszydzen.zadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vjdwmx on 8/19/2017
 */
public class BinaryArrayToNumber {
    public static void main(String[] args) {

    int liczba=0;
     liczba=   BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1)));
        System.out.println(liczba);
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int suma=0;
        System.out.println(binary.size());
        for(int i=binary.size()-1;i>=0;i--) {
            suma= (int) (suma + binary.get(i) * Math.pow(2,binary.size() - i - 1));
        }
        return suma;
    }
}
