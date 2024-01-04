package com.study.ch07;

public class UserMain01 {
    public static void main(String[] args) {
        User01 user1 = new User01("khs", "940107");
        User01 user2 = new User01("kbs", "911116", "김밤수", "efg@gmail.com");



        user1.showInfo();
        System.out.println("------------------------------------------------");
        user2.showInfo();
        System.out.println("------------------------------------------------");

        user1.setName("김한수");
        user1.setEmail("abc@gmail.com");

        user1.showInfo();


    }
}
