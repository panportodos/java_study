package com.study.ch08;

public class Car {
    String model;
    String color;

    //NoArgsConstructor 생성자
//    Car() {

//    }

    //AllArgsConstructor 생성자
    Car(String model, String color) {
        this.model = model;
        this.color = color;

    }

    @Override
    public String toString() { //Alt+Insert
        // "toString" 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드 입니다.
        return "Car{" +
                "model='" + model + '\'' + //\:엑셀에서 .같은 기능, 중복되는 부호를 컴퓨터가 인식하게 하기 위해 사용
                ", color='" + color + '\'' +
                '}';
    }
}
