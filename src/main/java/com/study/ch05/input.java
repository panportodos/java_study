package com.study.ch05;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        nextline을 제외하면 space로 입력을 받는다
        nextline만 버퍼로 엔터를 먹는다
         */
        System.out.print("title : ");
        String title = scanner.nextLine();

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();


// 입력과 버퍼, 입력도 버퍼가 필요하다
// next, nextint, nextline을 잘 구분해서 써야한다
        System.out.println(title +" : "+ (a+b+c));
    }
}
