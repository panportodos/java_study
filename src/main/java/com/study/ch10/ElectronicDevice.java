package com.study.ch10;
/*
추상화
1. 추상 클래스 abstract
2. 인터페이스 interface

 */
public abstract class ElectronicDevice { //추상 클래스, 상속을 해야지만(그 밑의 모든 내용을 구현해야지만) 쓸 수 있다.
    boolean powerState;
    void setPowerOn() {
        powerState = true;
    }
    void setPowerOff() {
        powerState = false;
    }
    abstract void showDeviceState();//추상메소드 : 인터페이스와 추상 클래스에서만 정의할 수있다. 아래의 실행문(어떻게 동작을 할 것이다라는 내부의 동작)는 정의하지 않는다
//        System.out.println("전원 상태 : "+ ((powerState) ? "켜짐":"꺼짐"));
    }

