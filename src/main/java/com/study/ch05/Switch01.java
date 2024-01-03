package com.study.ch05;
import java.util.Scanner;
public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
/*
case문은 case의 자료형이 중요
if문과 switch문은 어떨 때 쓸까?
if문은 조건을 비교할 때 사용하고
switch문은 값을 찾아 들어가 그에 해당하는 걸 수행해야할 때 많이 씀(문제프로그램, 게임 등)
 */
        switch (num) {
            case 0:
                System.out.println("0선택");
                break;
            case 1:
                System.out.println("1선택");
                break;
            case 2:
                System.out.println("2선택");
                break;
            default:
                System.out.println("오류");




        }
















    }
}
