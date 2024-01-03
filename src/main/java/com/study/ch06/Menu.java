package com.study.ch06;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //flag를 써야하는 경우가 있고, break를 써야하는 경우가 있다
        /*while(true) {
            System.out.println("입력: ");
            int inputValue = scanner.nextInt();

            System.out.println("입력한 번호: "+ inputValue);
            if(inputValue == 0){
                break;
            }


         콘솔 프로그램은 전부 아래 코드로 짜여져있다
         실제 컴퓨터 프로그램들도 다 while로 돌고있다
         (x버튼을 눌렀을 때 전체가 다 닫히고, 프로그램 안에서 다른 창으로 들어갔을 때 그 창을 종료하면 그 전 창으로 들어간다.
         Thread 라는 개념이 추가되긴 하지만. 얼추 비슷
         */
        boolean flag1 = true;
        //boolean flag2 = true; 여기다 선언할 필요 없고 1번으로 들어가는 while문 안에서 선언해야 계속 돈다

        while(flag1) {
        System.out.println("입력: ");
        int inputValue = scanner.nextInt();

        System.out.println("입력한 번호: " + inputValue);
        if (inputValue == 0) {
            System.out.println("프로그램을 종료합니다.");
            flag1 = false;
            }
         else if(inputValue ==1){
            System.out.println("1번으로 들어왔습니다");
            boolean flag2 = true;

            while(flag2) {
                System.out.print("1번에서 입력: ");
                inputValue = scanner.nextInt();
                System.out.println("입력한 번호: " + inputValue);
                if (inputValue == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    flag1 = false;
                    flag2 = false;
                    //break;
                } else if (inputValue == -1) {
                    System.out.println("뒤로가기");
                    flag2 = false;
                } else if (inputValue == 1) {
                    System.out.println("1번에서 1번으로 들어왔습니다");
                } else if (inputValue == 2) {
                    System.out.println("2번에서 2번으로 들어왔습니다");
                } else {
                    System.out.println("다시 입력하세요");
                }
                System.out.println();
            }
        } else if(inputValue == 2){
            System.out.println("2번으로 들어왔습니다");
        } else {
            System.out.println("다시 입력하세요");
        }
        System.out.println();

        }

    }
}
