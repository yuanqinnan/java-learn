package com.yuanqinnan.pojo;

import com.yuanqinnan.model.Order;
import lombok.Data;

@Data
public class OrderUserVO extends Order {
    /**
     * 客户名称
    */
    private String username;
    /**
     * 客户地址
    */
    private String address;

}