package com.study.ch07.practice;

import com.study.ch07.register.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        Service Service = new Service();

        String name = null;
        String age = null;
        String disease = null;

        System.out.println("환자 등록 시스템");
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("나이 : ");
        age = sc.nextLine();
        System.out.print("질병 : ");
        disease = sc.nextLine();


        Patient Patient = new Patient(name, age, disease);
        Service.registerPatientService(Patient);



    }
}
