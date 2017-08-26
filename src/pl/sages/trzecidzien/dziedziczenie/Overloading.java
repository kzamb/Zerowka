package pl.sages.trzecidzien.dziedziczenie;

public class Overloading {

    public static long twice(int i) {
        System.out.println("integer");
        return 2*i;
    }

    public static long twice (long i) {
        System.out.println("long");
        return 2*i;
    }

    public static void main(String[] args) {
        int a=5;
        long c=100;

        twice(a);
        twice(c);
    }
}
