package com.study.ch01;

public class PrintStudy {
    public static void main(String[] args) {
        System.out.println(2 + 4);
        System.out.println("가나");
        System.out.println("\uAC00");
        System.out.println("김"+"범"+"수"); //문자열
        System.out.println('김'+'범'+'수'); //문자 -> 숫자로 연산됨
        System.out.println(""+'김'+'범'+'수'); //가장 처음 본 자료형이 문자열이므로 우선순위가 문자열로 가서 문자열로 만들어버림
        System.out.println(""+10+20); // 따라서 순서가 중요하다
        System.out.println(""+(10+20)); // 괄호치면 우선순위 높아짐
        // char : 2 bite 0000 0000 0000 0000{2진수} = ac00 {16진수}
    }
}
