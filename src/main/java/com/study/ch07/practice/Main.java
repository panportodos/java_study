package com.study.ch07.practice;
import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        boolean loopFlag = true;
        String selectedMenu = null;


        Patient[] patients = new Patient[3];
        Repository Repository = new Repository(patients);
        Service Service = new Service(Repository);

        while (loopFlag) {
            System.out.println("환자 관리 프로그램");
            System.out.println("1. 환자 등록");
            System.out.println("2. 환자 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            selectedMenu = sc.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램을 종료합니다.");
                loopFlag = false;
            }   else if("1".equalsIgnoreCase(selectedMenu)) {

                String name = null;
                String age = null;
                String disease = null;

                if (Service.isFull()) {
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue;
                }

                System.out.println("이름 >>> ");
                name = sc.nextLine();
                System.out.println("나이 >>> ");
                age = sc.nextLine();
                System.out.println("질병 >>> ");
                disease = sc.nextLine();

                    Patient Patient = new Patient(name, age, disease);
                    Service.append(Patient);




                   // Service.registerPatientService(Patient);

                }

                else if("2".equalsIgnoreCase(selectedMenu)) {
                Service.printList();

            }
        }
        System.out.println("프로그램이 종료되었습니다.");

}
}




