package com.study.ch10;

public class ElectronicDeviceMain {

    public static void main(String[] args) {

        new RemoteController();

        //익명클래스 - 굳이 클래스로 빼지 않고도 이 안에서 재정의 해서 쓰는 클래스, 한 번 쓰고 버릴 기능들에 주로 쓴다
        ElectronicDevice electronicDevice = new ElectronicDevice() { //괄호 앞에서 Ctrl+space치면 오버라이드 또 나온다
            @Override
            void showDeviceState() {
                System.out.println("첫번째 기기 상태확인");

            }
        };
        ElectronicDevice electronicDevice2 = new ElectronicDevice() { //1,2는 전혀 다른 객체, 여기서 생성된 객체는 다른데서는 쓸 수 없다
            @Override
            void showDeviceState() {
                System.out.println("두번째 기기 상태확인");

            }
        }; //Elec Device는 Abstract class이므로 생성할 수 없다
        RemoteController remoteController = new RemoteController(); //Remote Con.은 그냥 class이므로 생성 가능하다

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];
        electronicDevices[0] = electronicDevice;
        electronicDevices[1] = electronicDevice2;
        electronicDevices[2] = remoteController;

        for(int i = 0; i < electronicDevices.length;i++) {
            electronicDevices[i].showDeviceState();

            }

        }
    }

