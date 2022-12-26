package com.kh.mybatis;

import lombok.Data;

import java.util.List;

// DB 테이블과 매핑할 객체 생성
// @Data : @Getter, @Setter, @Constructor, @ToString...모두 포함
@Data
public class Company {
    private int id;
    private String name;
    private String address;
    private List<Employee> employeeList;
}
