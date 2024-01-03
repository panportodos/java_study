package com.study.ch05;
import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        이름 : 김범수
        나이 : 32
        연락처 : 01029718867
        학년 : 4
        주소 : 부산 금정구
         */
        String name = null;
        int age = 0;
        String phone = null;
        int grade = 0;
        String address = null;
        //변수는 다 위로

        System.out.print("이름 :");
        name = scanner.next();

        System.out.print("나이 :");
        age = scanner.nextInt();

        System.out.print("연락처 :");
        phone = scanner.next();

        System.out.print("학년 :");
        grade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("주소 :");
        address = scanner.nextLine();

        System.out.println("이름 : "+name+"\n나이 : "+age+"\n연락처 : "+phone+"\n학년 : "+grade+"\n주소 : "+address);

/*
        public static void main(String[] args) {

            int x = -1;

            int y = 0;

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

 */
    }






    }

