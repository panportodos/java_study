package com.study.ch11;

public class Phone {
    static int autoCount = 1;
    int serialNumber;
    Company company;

    public Phone(Company company) { //alt + insert - 생성자 생성
        autoCount++;
        this.serialNumber = 20240000;
        this.serialNumber += autoCount;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString() +
                '}';
    }
}
