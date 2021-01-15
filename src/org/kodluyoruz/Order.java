package org.kodluyoruz;

import java.util.concurrent.LinkedBlockingQueue;

public class Order {

    private String orderName;
    private String orderState;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderState() {
        return orderState;
    }

    public Order() {
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Order(String orderName, String orderState){
        this.orderName = orderName;
        this.orderState = orderState;
    }



}
