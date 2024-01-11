package com.study.ch09;

public class ElectronicDeviceMain {

    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = new ElectronicDevice[100];

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i] = i % 2 ==0 ? new Computer() : new SmartPhone();
        }
        for (int i= 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        System.out.println();
        for (int i= 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn();
        }
        System.out.println();
        for (int i= 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }
        for(int i = 0; i < electronicDevices.length; i++) { //업캐스팅은 자연스레 되지만 다운캐스팅은 다른 자식으로 못함 따라서 물어봐줘야
            if(electronicDevices[i] instanceof Computer) { //instance: 생성한 객체. 컴퓨터의 인스턴트냐 물어보는 질문.
                Computer computer = (Computer) electronicDevices[i];
                computer.playGame();
            } else if(electronicDevices[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();
            }
        }
//        SmartPhone smartPhone = new SmartPhone();
//        ElectronicDevice electronicDevice2 = smartPhone; //업캐스팅
//
//        electronicDevice.showDeviceState();
//        computer.showDeviceState();
//        smartPhone.showDeviceState();
//        for(int i = 0; i < computers.length; i++){
//        computers[i].setPowerOn();
//        computer.showDeviceState();
    }
}
