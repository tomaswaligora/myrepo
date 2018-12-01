package com.company;

public class Choinki {
    private static final int DIMENSION = 8;
//i - poziomo
//j - pionowo
    public static void main(String[] args) {
        for(int i = 0; i < DIMENSION; i++) {
            for(int j = 0; j < DIMENSION; j++) {
                if (i==0 && j==0 || i==DIMENSION-1 && j==DIMENSION-1 || i==DIMENSION-1 && j==0  || i==0 && j==DIMENSION-1){

                    System.out.print("1  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
    }
}