package com.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User implements Serializable {

    private long id;
    private String password;
    private String position;
    private String email;
    private String phone;
    private String name;
    private String sex;
    private String birth;


}
