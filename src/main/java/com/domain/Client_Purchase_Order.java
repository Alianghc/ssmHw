package com.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Client_Purchase_Order {

    //    采购清单，已付款的商品
    private int id;//采购清单id
    private String date;
    private String address;//发货地址
    private String state;//状态
    private float sum;
    private long order_id;//合同id
    private List<Client_Purchase_Goods> listGoods;//已付款商品


}
