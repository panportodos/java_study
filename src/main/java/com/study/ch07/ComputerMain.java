package com.study.ch07;

import java.util.Scanner;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer1 = new Computer(); //인스턴트를 새로 만드는 행위 : 객체를 생성한다 = 메모리를 할당한다
        Computer computer2 = new Computer("노트북"); //생성자 호출 (ctrl+클릭), 생성자는 무조건 주소를 리턴한다(return이 없는 이유)
                                                    //생성할 때부터 "노트북"이라는 type을 주입한다
        //Scanner scanner = new Scanner(System.in);
        System.out.println(computer1);
        System.out.println(computer2);

        computer1.cpu = "i5";
        computer2.cpu = "i7";

        computer1.ram = "8GB";
        computer2.ram = "16GB";

        computer1.disk = "HDD";
        computer2.disk = "SSD";

        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);
        computer1.showInfo();
        computer2.showInfo();


    }
}
