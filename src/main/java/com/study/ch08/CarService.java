package com.study.ch08;

public class CarService {

    CarRepository carRepository;

    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    Boolean isFull() {
        return carRepository.getEmptyIndex() == -1; //boolean, empty count가 0이 아니면 false, 0이면 true
    }
    void append(Car car) {
        carRepository.insert(car);
    }
    void printCarList() {
        Car[] cars = carRepository.getCarData();
        if(cars.length ==0) {
            System.out.println("등록된 차량이 없습니다.");
            return;
        }
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    /*
        for (int i = 0; i < carRepository.cars.length; i++) {
            if (carRepository.cars[i] == null) {
                carRepository.cars[i] = car;
                break;
            }
        }

     */
                /* 아래 코드는 위 코드로 더 간단히 나타낼 수 있다
                int emptyIndex = 0;
                for (int i = 0; i < cars.length; i++) {
                    if(cars[i] == null) { //비어있는 인덱스를 찾는다
                    emptyIndex = i;
                    break;
                    }
                }
                    Car cars[emptyIndex] = new Car(model, color);
                    System.out.println(cars[emptyIndex].toString());


                 */
    }
}
