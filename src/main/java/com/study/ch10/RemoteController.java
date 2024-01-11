package com.study.ch10;

public class RemoteController extends ElectronicDevice {
    @Override //Ctrl i - 무조건 재정의해줘야하는 오버라이드, Ctrl O - 임플리먼트랑 오버라이드 같이 뜸
    void showDeviceState() {
        System.out.println("리모컨의 상태를 확인합니다.");
    }
//    @Override
//    void showDeviceState() {
//        super.showDeviceState("리모콘 상태 확인");
//    }
}
