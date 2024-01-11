package com.study.ch11;

public class SamsungCompany {

    static String name = "삼성"; //인스턴스가 생성되기 전에 클래스 안에서도 따로 메모리가 할당되어 samsungCompany클래스에서도 이 변수를 쓸수있다
                                //메모리를 공유한다는 개념이 중요

    void showCompanyInfo() {
        System.out.println("회사명: " + name);
    }
}
