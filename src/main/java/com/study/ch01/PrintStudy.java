package com.study.ch01;
// class 명은 파스칼 표기법
// 함수 변수 명은 카멜 표기법

public class PrintStudy {
    public static void main(String[] args) {
        System.out.println("\u0061");
        System.out.println("\u1F601");
        System.out.println("" + '권' + '기' + '퐁' + '퐁'); //문자열 우선 (문자열 + 문자 = 문자열)
        System.out.println("레벨: " + 16 + 22 ); // 문자열 + 숫자 = 문자열 숫자 부분은 문자열로 인식
        System.out.println('권' + '기'); //해당 문자의 유니코드로 인식됨
        // 0000 0000 0000 0000
        //
        // char자료형 -> 2바이트

    }
}
