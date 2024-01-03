package com.study.ch06;

public class For02 {
    public static void main(String[] args){
        /*
        0, 1, 2, 3, 4
        5, 6, 7, 8, 9
         */

        for(int i=0; i<20; i++){
            System.out.print(i);
            if (i%5 !=4){
                //지속가능한 코드를 위해 나머지를 잘 활용하자 (i%5 !=4)
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        int n = 10;

        for(int i=0; i<n; i++){

            System.out.print(n-1-i);
            if (i%5 !=4){
                //지속가능한 코드를 위해 나머지를 잘 활용하자 (i%5 !=4)
                System.out.print(", ");
            } else {
                System.out.println();
            }

        }
    }
}
