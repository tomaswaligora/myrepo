package com.company;

import java.util.Scanner;

public class Potega {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj podstawe: ");
        int podstawa = scan.nextInt();
        System.out.println("podaj potege :");
        int potega = scan.nextInt();

        int wynik = 1;

        for (int i = 1; i <= potega; i++) {

            wynik = wynik * podstawa;
        }
        System.out.println(wynik);

    }
}
//1 * 2
//2 * 2


// !5 = 1*2*3*4*5