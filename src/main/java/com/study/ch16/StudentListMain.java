package com.study.ch16;

import java.awt.dnd.DragGestureListener;
import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("김범수",33));
        students.add(new Student("김밤수",32));
        students.add(new Student("김한수",31));
        students.add(new Student("김헌수",30));

        System.out.println(students);

//        Student s = new Student("aaa", 10);
//        s.setAge(s.getAge()+1);

        for(int i= 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.setAge(student.getAge()+1);
//            students.get(i).setAge(students.get(i).getAge()+1);
        }
        //향상된 for문
        for(Student student : students) {
            student.setAge(student.getAge()+1);
        }
        //forEach(람다식)
        students.forEach(student -> student.setAge(student.getAge()+1));

           Student[] studentArray = new Student[4];
//        for(int i = 0; i < studentArray.length; i++) {
//            studentArray[i] = new Student("김준"+i, 31+i);
//        }
        int i = 0;
        for(Student student : studentArray) {
            studentArray[i] = new Student("김준일", 31);
           // student = new Student("김준일", 31); // student는 배열이 아니라 배열을 담기위한 임시변수이므로 이렇게 쓰면 안된다
            i++;
        }


        for(Student student : studentArray) {
            System.out.println(student);
        }

    //    students.get(0) = new Student("김준일", 31);
        students.set(0,new Student("김준일", 31));




    }
}
