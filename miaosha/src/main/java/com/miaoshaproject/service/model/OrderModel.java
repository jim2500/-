package com.miaoshaproject.service.model;

import java.math.BigDecimal;

/**
 * @Classname OrderModel
 * @Description TODO
 * @Date 2019/12/6 22:26
 * @Created by sj
 */

//用户下单的交易模型
public class OrderModel {
    //2019120600001
    private String id;

    //用户id
    private Integer userId;

    //商品id
    private Integer itemId;

    //购买数量
    private Integer amount;

    //商品单价
    private BigDecimal itemPrice;

    //购买金额
    private BigDecimal orderPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }
}
