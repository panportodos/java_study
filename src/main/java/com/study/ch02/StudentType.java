package com.study.ch02;

public class StudentType extends Person {
    int studentYear;
    String address;

    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("학년: " + studentYear + "학년");
        System.out.println("주소: " + address);

    }
}
