package pl.sages.drugidzien;

import java.util.Scanner;

/**
 * Created by vjdwmx on 8/20/2017
 */
public class WejscieWyjscie {

    public static void main(String[] args) {
        //wyjscie
        System.out.println("KKK");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe:");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podałes liczbe:"+ x);

        String name = scanner.nextLine();

        System.out.println("Podałeś: "+ name);


    }


}
