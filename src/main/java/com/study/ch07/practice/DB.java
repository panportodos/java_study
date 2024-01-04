package com.study.ch07.practice;

public class DB {
    void insertPatient(Patient Patient) {
        System.out.println("DB에 Insert 완료");
        System.out.println("이름: "+ Patient.name);
        System.out.println("나이: "+ Patient.age);
        System.out.println("질병: "+ Patient.disease);
    }


}
