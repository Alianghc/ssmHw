package com.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Purchase_Order {

    private long id;
    private String date;
    private String address;
    private String state;
    private float sum;
    private long goods_id;
    private int number;
    private long warehouse_keeper_id;


}
