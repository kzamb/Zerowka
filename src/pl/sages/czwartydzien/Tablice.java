package pl.sages.czwartydzien;

import java.util.Arrays;
import java.util.Comparator;

public class Tablice {



    public void xprint() {

    }
    public static void statPrint () {

    }
    public static void main(String[] args) {
        new Tablice().xprint();

        Tablice.statPrint();

        Integer[] liczby = {83, 33, 1, -3, 5};

        System.out.println("przed sortowaniem");
        System.out.println(Arrays.toString(liczby));
        Arrays.sort(liczby);

        System.out.println("po sortowanieu");
        System.out.println(Arrays.toString(liczby));


        System.out.println("po sortowaniu");
        Arrays.sort(liczby, new ReverseComparator());
        System.out.println(Arrays.toString(liczby));

        System.out.println("po sortowanieu");
        Arrays.sort(liczby, new ModuloComparator());
        System.out.println(Arrays.toString(liczby));


        System.out.println(Arrays.binarySearch(liczby, 33));


    }
}

    class ReverseComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return -(o1 - o2);
        }
    }

    class ModuloComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return -(o1%10 - o2%10);
        }
    }

