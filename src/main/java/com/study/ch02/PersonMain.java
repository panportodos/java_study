package com.study.ch02;

import java.util.Scanner;

public class PersonMain {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "권기범";
        p.age = 25;

        Person p2 = new Person();
        p2.name = "기범";
        p2.age = 36;


        int a = 10;

        /*
        * StudentType 이름, 학년, 주소를 저장할 수 있는 클래스를 만드시오.
        * */

        StudentType s = new StudentType();

        s.name = "권기범";
        s.studentYear = 4;
        s.address = "부산 서구";

        s.showInfo();



        Person p3 = s;
        StudentType s2 = (StudentType) p3;

//        Person 전주환 = new Person();
//        StudentType 전주환학생 = (StudentType) 전주환;

        StudentType 전주환학생 = new StudentType();
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환사람;





    }
}
