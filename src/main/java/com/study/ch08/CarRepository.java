package com.study.ch08;

public class CarRepository { //배열과 관련된건 다 여기로.
    final Car[] cars; //Car배열을 무조건 가지고 있어야한다 = final

    CarRepository(Car[] cars){
        this.cars = cars;
    }
/*
    int getEmptyCount() {
        int emptyCount = 0;
        for(int i = 0; i< cars.length; i++) {
            if(cars[i] == null) {
                emptyCount++;
            }
        }
        return emptyCount;
    }
    getEmptyIndex함수를 만드는 순간 getEmptyCount함수가 필요없어진다
 */
    int getEmptyIndex() {
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i;
            }
        }
        return -1;
    }
    void insert(Car car) { //무엇을(차를) 어디에다가(인덱스에다가) 넣을건가
        cars[getEmptyIndex()] = car;
    }
    Car[] getCarData() {
        int carCount = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null ) {
                carCount++;
            }
        }
        Car[] newCars = new Car[carCount];
        int j = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }
        return newCars;
    }
}
