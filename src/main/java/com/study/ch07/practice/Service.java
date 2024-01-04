package com.study.ch07.practice;



public class Service {


    void registerPatientService(Patient Patient) {
        Repository Repository = new Repository();
        Repository.savePatient(Patient);

    }
}
