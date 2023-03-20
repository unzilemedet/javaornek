package com.unzilemedet;

public class Runner2 {
    public static void main(String[] args) {
        /*
               *  *  *  *
               *        *
               *        *
               *  *  *  *

            */

        int uzunluk = 4;
        for(int i= 1; i <= uzunluk * uzunluk ; i++){
             if (i <= uzunluk     ||   i > uzunluk * (uzunluk - 1 ))
                 System.out.print( "*  ");
             else if (i %uzunluk==0 || i %uzunluk==1)
                 System.out.print("*  ");
             else
                 System.out.print("   ");
             if(i %uzunluk == 0)
            System.out.println();
        }

    }
}
