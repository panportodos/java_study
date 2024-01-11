package com.study.ch09;

public class SmartPhone extends ElectronicDevice {
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다.");
    }

    @Override //ctrl+O - 상속받은 부모 클래스 함수의 오버라이드
              //@로 시작하면 "어노테이션", 부모로부터 오버라이드 되었다는 것을 표시하기 위해 씀
    void showDeviceState() {
        super.showDeviceState();
    }
    //    void showDeviceState() {
//        System.out.println("스마트폰 전원 상태 : "+ ((powerState) ? "켜짐":"꺼짐"));
//    }
}
