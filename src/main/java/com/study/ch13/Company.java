//package com.study.ch13;
//
///*
//Company 클래스를 싱글톤을 적용하여 구현하시오.
// */
//
//
//public class Company {
//    private static Company instance; //1. 프라이빗 변수
//    private String name;
//
//    private Company() {} //2. 프라이빗 생성자
//    public static Company getInstance() {
//        if(instance == null) {
//                instance = new Company();
//
//            }
//        }
//    }
//
