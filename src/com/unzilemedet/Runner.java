package com.unzilemedet;

public class Runner {
    public static void main(String[] args) {
        /* 120 ile 4 arasında 5 e bölünen sayılar */
        for(int i=120 ; i>4 ; i--){
            if(i %5==0 ){
                System.out.println(i);
            }
        }

    }
}
