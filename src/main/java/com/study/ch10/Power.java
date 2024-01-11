package com.study.ch10;

//인터페이스의 특징 : 변수 선언이 불가능하다
//void setPowerOn() {} - 빨간줄 뜸
//boolean powerstate = null; - 빨간줄 뜸
//boolean powerState = false; 이건 가능. 인터페이스는 모든 변수가 상수이다. 상수선언은 가능하다.
public interface Power { //(추상메소드는 일반 메소드와 동일하지만) 일반 메소드 인터페이스는 기본적으로 메소드가 추상메소드다.
    String ERROR_CODE = "-9999";
    void setPowerOn();
    void setPowerOff();

    default void test() { //얘는 abstract를 붙이는게 아니라 default를 붙이면 일반 메소드를 정의할 수 있다

    }
}
