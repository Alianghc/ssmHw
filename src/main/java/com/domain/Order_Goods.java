package com.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order_Goods {

//    合同商品列表
    private long id;
    private float price;
    private float sum;
    private String goods_name;
    private String state;
    private long order_id;
    private int number;


}
