package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        System.out.println("띄어쓰기로 구분");
        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1사분면");
        } else if (x < 0 && y > 0) {
            System.out.println("2사분면");
        } else if (x > 0 && y < 0) {
            System.out.println("3사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("4사분면");
        } else {
            System.out.println("좌표 위에 있다");
        }
    }
}