package com.study.ch02;

public class Variable {

    public static void main(String[] args) {
        int date = 20231230;  //data라는 이름을 가진 변수를 선언하는 동시에 20231229를 해당 변수에 대입한다.
        double date2 = date;  // 업캐스팅 (자료형) 생략
        int date3 = (int) date2;  //double > int 다운캐스팅

        //문자 -> 정수 -> 실수\

        char a = '1';
        int b = a;
        double c = b;
        //업캐스팅


        System.out.println(date + 1);
        System.out.println(date + 2);
        System.out.println(date + 3);
        System.out.println(date + 4);
        System.out.println(date + 5);
        System.out.println(date + 6);
        System.out.println(date + 7);
        System.out.println(date + 8);
        System.out.println(date + 9);

    }
}
