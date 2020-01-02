package com.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order implements Serializable {

//    合同
    private int id;
    private String date;//日期
    private String address;//发货地址
    private String state;//状态
    private float sum ;//总额
    private String client_email;//客户email
    private String salesman_id;//销售人员id
    private List<Order_Goods> orderGoods;//合同全部商品

}
