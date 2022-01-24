package com.zhang.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfo {
    private String name;
    private int age;
    private float salary;
    private String address;
    private String remark;
    private Date createTime;
    private String birthDate;
}
