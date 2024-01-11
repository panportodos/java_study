package com.study.ch08;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true; // 무한루프
        //Car car1 = null; //while밖에 있으니까 정보가 저장된다

        //한줄로 쓰면 다음과 같다. CarService carService = new CarService(new CarRepository(new Car[3]));
        Car[] cars = new Car[3]; //Car 정보가 들어갈 수 있는 공간 3 개를 만든다
        CarRepository carRepository = new CarRepository(cars);
        CarService carService = new CarService(carRepository);
        //carService.carRepository = carRepository;
        //carRepository.cars = cars;


        while (loopFlag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();
            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램을 종료합니다.");
                loopFlag = false;
            } else if ("1".equalsIgnoreCase(selectedMenu)) {
                System.out.println("<<<자동차 등록 페이지>>>");


                String model = null;
                String color = null;

                if (carService.isFull()) {
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue;
                }

                System.out.println("모델명 >>> ");
                model = scanner.nextLine();
                System.out.println("색상 >>> ");
                color = scanner.nextLine();


                Car car = new Car(model, color); //정보를 담는 클래스 = 엔티티
                carService.append(car); //배열에 들어간다
                //System.out.println(car.toString());


                //데이터를 받았으니 데이터를 묶어줄 클래스가 필요하다 - Car
                //Car car = new Car();
                //car.model = model;
                //car.color = color; 이렇게 넣는 대신 Car Class에 AllArgs생성자를 만들어 그 쪽에서 저장한다
                //이럴 경우 클래스에 생략돼있던 NoArgs생성자(Car())는 재정의되므로 다시 정의하거나 쓰지 말아야한다
                //System.out.println("Car(model = " + car.model + ", color = "+ car.color+ ")");
            } else if ("2".equalsIgnoreCase(selectedMenu)) {
                System.out.println("<<<자동차 조회 페이지>>>");
                carService.printCarList();

            } else {
                System.out.println("다시 입력하세요.");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}



