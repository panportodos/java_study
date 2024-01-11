package com.study.ch07.practice;

public class Repository {
    final Patient[] patients;
    Repository(Patient[] patients){
        this.patients = patients;
    }
    int getEmptyIndex() {
        for(int i = 0; i < patients.length; i++) {
            if(patients[i] == null) {
                return i;
            }
        }
        return -1;
    }
    void insert(Patient Patient) {
        patients[getEmptyIndex()] = Patient;
    }

    Patient[] getData() {
        int Count = 0;
        for(int i = 0; i < patients.length; i++) {
            if(patients[i] != null ) {
                Count++;
            }
        }
        Patient[] newPatients = new Patient[Count];
        int j = 0;
        for(int i = 0; i < patients.length; i++) {
            if(patients[i] != null) {
                newPatients[j] = patients[i];
                j++;
            }
        }
        return newPatients;
    }

//    void savePatient(Patient Patient) {
//       DB DB = new DB();
//        DB.insertPatient(Patient);
//    }
}
