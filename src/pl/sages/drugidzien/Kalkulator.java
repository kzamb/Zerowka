package pl.sages.drugidzien;

import java.util.Scanner;

/**
 * Created by vjdwmx on 8/20/2017
 */
public class Kalkulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String operacja = sc.next();

        switch (operacja) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
            System.out.println("nie wiem");

        }



    }




}
