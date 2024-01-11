package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //NoArg와는 같이 못씀
@AllArgsConstructor
@Data
public class Student2 {
    private final String name;
    private String address;
    @NonNull //필수값인데 바뀔 가능성이 있는 경우 final 앞에 nonnull을 붙인다
    private final String phone;
}
