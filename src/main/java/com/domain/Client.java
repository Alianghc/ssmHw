package com.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Client implements Serializable {

    private String name;//客户名
    private String sex;//性别
    private String email;
    private String phone;
    private String birth;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}
