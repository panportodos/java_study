package com.study.ch05;
import java.util.Scanner;
/*
함수 - 스위치 안에 y/n으로 계속 진행할건지 break할건지 정해야하는데
그러려면 각각의 case안에 중복해서 변수를 받을수없어서 함수를 써서 불러온다.
지역/전역 변수
 */
public class Switch02 {
    public static boolean select() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("여기서 멈출까요(y/n?");
        String value = scanner.next();
        return "y".equals(value);

        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;

        System.out.println("게임 시작");
        switch (num) {
            case 1:
                System.out.println("1단계 시작");
                if(select()) {
                    break;
                }
            case 2:
                System.out.println("2단계 시작");
                if(select()) {
                    break;
                }
            case 3:
                System.out.println("3단계 시작");
                if(select()) {
                    break;}
           case 4:
                System.out.println("4단계 시작");
                if(select()) {
                    break;}
            case 5:
                System.out.println("마지막 단계 시작");

        }


    }
}
