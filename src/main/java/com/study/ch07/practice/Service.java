package com.study.ch07.practice;

public class Service {

        Repository Repository;

        Service(Repository Repository) {
            this.Repository = Repository;
        }

        Boolean isFull() {
            return Repository.getEmptyIndex() == -1;
        }
        void append(Patient Patient) {
            Repository.insert(Patient);
        }


//    void registerPatientService(Patient Patient) {
//        Repository Repository = new Repository();
//        Repository.savePatient(Patient);


     void printList() {
        Patient[] patients = Repository.getData();
        if (patients.length == 0) {
            System.out.println("등록된 환자가 없습니다.");
            return;
        }
        for (int i = 0; i < patients.length; i++) {
            System.out.println(patients[i].toString());
        }
    }
}
