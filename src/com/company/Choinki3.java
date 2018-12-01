package com.company;

import java.util.Scanner;

public class Choinki3 {

    private static final int dimension = 9;


    public static void main(String[] args) {
        int zmienna = 0;
        for (int i = 0; i <= dimension; i++) {
            for (int j = 0; j <= dimension; j++) {
                if (j <= ((dimension/2) + zmienna) && (j >= (dimension/2) - zmienna)){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
            if (i < dimension / 2){
                zmienna++;
            } else {
                zmienna--;
            }
        }
    }
}