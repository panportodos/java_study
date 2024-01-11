package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data //Setter Getter Equals ToString을 포함한 기능
public class Student {
    private String name;
    private String address;
    private String phone;
    private int age;


}
