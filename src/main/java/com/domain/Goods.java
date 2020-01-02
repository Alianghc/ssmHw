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
public class Goods implements Serializable {

//    商品
    private int goods_id;//货物id
    private String goods_name;//货物名称
    private int inventory;//仓库现存货量
    private int min_inventory;//进货阈值
    private float price;//商品单价


}
