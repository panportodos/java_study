package com.study.ch07;

public class Computer {
    String cpu;
    String ram;
    String disk;
    String type;

    //생성자 1. 클래스의 이름과 동일 2. 메소드의 형태로 되어있음
    Computer() {
    //    System.out.println("컴퓨터 하나 생성");
            type = "컴퓨터";
    }
    Computer(String type) { //생성자 오버로딩
        //    System.out.println(type + " 하나 생성");
        this.type = type; //자기 자신의 주소
        // 변수의 우선순위는 지역변수에 있으므로 타입을 전역으로 저장하기 위해 this가 필요함
        // 전역도 type이고 지역도 type이니까 this를 붙여야 지금 현재 클래스의 주소를 받아 저장된다
    }
    void showInfo() { //클래스 안에 정의된 함수 : 메소드, 자바는 모두 클래스이므로 자바에서의 모든 함수는 메소드
                    //생성자가 아닌 메소드는 리턴값을 주고받는데 return이 없는 메소드는 void가 필요하다
        System.out.println("type: "+type);
        System.out.println("cpu: "+cpu);
        System.out.println("ram: "+ram);
        System.out.println("disk: "+disk);
    }
}
