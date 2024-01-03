package com.study.ch06;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("별 몇 개?");
        int starCount = scanner.nextInt();

        for(int i=0; i< starCount; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
/* Q1
***
**
*
 */
        for(int i=0; i< starCount; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
/* Q2
 ***
  **
   *
 */
        for(int i=0; i< starCount; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
/* Q3
   *
  **
 ***
 */

        for(int i=0; i< starCount; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    /* Q4
     *
    ***
   *****
     */
        for(int i=0; i< starCount; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}