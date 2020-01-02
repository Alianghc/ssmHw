package com.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Dispatch_Order {

//    发货单
    private long id;
    private String date;
    private String address;
    private String state;
    private float sum;
    private String goods_name;
    private int number;
    private long order_id;
    private long sales_keeper_id;
    private long warehouse_keeper_id;
    private String ems_number;
}
