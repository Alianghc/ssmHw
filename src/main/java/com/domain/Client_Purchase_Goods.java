package com.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Client_Purchase_Goods {

    //    已付款商品的信息
    private long id;
    private String goods_name;
    private long qingdan_id;//采购清单id
    private int number;

}
