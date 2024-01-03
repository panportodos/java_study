package com.study.ch06;

public class For01 {
    public static void main(String[] args) {
        /*
        for와 while을 써야할 때
        for : 반복적으로 증가하며 조건을 수행할 때, 즉 반복 횟수가 중심일 때
        while : 조건이 중심일 때

         */
        for(int i=0; i<10; i++) {
            System.out.println("i: " + i);
        }

        int i=0;
        while(i<10) {
            System.out.println("i: "+i);
            i++;
        }
    }
}
