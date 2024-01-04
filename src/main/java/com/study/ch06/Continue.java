package com.study.ch06;

public class Continue {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if( i% 2 != 0) {
                continue;
            }
            System.out.println("for문 마지막");
            //짝수일 땐 위 글을 출력한다
            //continue를 만나면 밑에 코드를 실행한다
            //코드의 가독성을 위해 쓴다
        }

    }
}
