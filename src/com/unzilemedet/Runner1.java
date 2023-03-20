package com.unzilemedet;

public class Runner1 {
    public static void main(String[] args) {
        /*----------------------
        *  *  *  *  *  *
        *  *  *  *  *  *
        *  *  *  *  *  *
        *  *  *  *  *  *
        *  *  *  *  *  *
        *  *  *  *  *  *
        ---------------------- */

        System.out.println("*  *  *  *  *  *");
        System.out.println("*  *  *  *  *  *");
        System.out.println("*  *  *  *  *  *");
        System.out.println("*  *  *  *  *  *");
        System.out.println("*  *  *  *  *  *");
        System.out.println("*  *  *  *  *  *");

        System.out.println();
        System.out.println("----------------------------------");

        for(int i=0; i<6 ; i++){
            System.out.println("*  *  *  *  *  *");
        }

        System.out.println("----------------------------------");

        int uzunluk = 6;
        for(int i = 1; i<=uzunluk*uzunluk ; i++){
            System.out.print("*  ");
           if (i %uzunluk == 0){
               System.out.println();
           }

        }
        System.out.println("----------------------------------");

        for(int i = 0 ; i < uzunluk ; i++){
            for (int j = 0; j < uzunluk; j++)
                System.out.print("*  ");
                System.out.println();

        }

    }
}
