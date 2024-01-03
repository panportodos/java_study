package com.study.ch05;

import java.awt.*;

public class If01 {
    public static void main(String[] arg) {
        //조건문
        int i = 0;

        if(i > 3) {
            System.out.println("i가 3보다 큽니다.");
            System.out.println("if문 종료");
        } else if(i==3) {
                System.out.println("i가 3입니다.");
        } else {
            System.out.println("i가 3보다 작습니다.");
        }
        /*
        else if 가 나온 배경 : else 이후에 명령이 if밖에 없으므로 중괄호를 없애서 else if가 되었다
        else {
            if(i==3) {
                System.out.println("i가 3입니다.");
            } else {
                System.out.println("i가 3보다 작습니다.");
            }
        }
         */


        String tempStr = i > 3 ? print("i가 3보다 큽니다.") : "";


    }

    public static String print(String str) {
        System.out.println(str);
        return str;

    }
}
