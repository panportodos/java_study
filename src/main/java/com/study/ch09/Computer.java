package com.study.ch09;

public class Computer extends ElectronicDevice {
    String cpu;
    int ram;

    void playGame() {
        System.out.println("PC 게임을 합니다.");
    }

    //재정의 - 부모의 메소드와 동일한 메소드 형태로 실행문만 다시 정의할 수 있다
    void showDeviceState() {
        System.out.print("컴퓨터");
        super.showDeviceState();//this가 자신의 주소 참조라면 super는 부모의 주소 참조

    }
}
