package com.study.ch04;

import java.util.Scanner;

public class Operation06 {
    public static void main(String[] args) {
        /*
        * << 문제 >>
        *
        *
        * 조건연산자(삼항연산자)
        * a > 0 ? "양수" : a == 0 ? "0" : "음수"
        * */

        int iResult = 10 > 2 ? 1111 : 2222; // 결과값의 자료형이 일치해야 한다.
        String sResult = 10 > 2 ? "1111" : "2222"; // 결과값의 자료형이 일치해야 한다.
        boolean bResult = 10 > 2;

        Boolean.parseBoolean("true");

        String name = null;
        System.out.println(name == null);
        System.out.println(name == null);
        System.out.println("테스트 코드 작성");

        name = "권기범";
        String name2 = new String("권기범");


        System.out.println(name.equals("권기범"));
        System.out.println(name2.equals("권기범"));




    }
}
