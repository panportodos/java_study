package com.study.ch07.practice;

public class Repository {
    void savePatient(Patient Patient) {
        DB DB = new DB();
        DB.insertPatient(Patient);

    }
}
