package com.study.ch11;

public class Company {
    String name = "삼성";
    void setName(String name) {
        this.name = name;
    }
    void showCompanyInfo() {
        System.out.println("회사명: " + name);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
