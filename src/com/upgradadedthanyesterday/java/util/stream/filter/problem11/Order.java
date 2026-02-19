package com.upgradadedthanyesterday.java.util.stream.filter.problem11;

import java.sql.Timestamp;

public class Order {
    private final int id;
    private final double amount;
    private final Customer customer;
    private final Timestamp creationTime;
    private final Timestamp deliveryTime;
    private final OrderStatus status;

    public Order(int id, double amount, Customer customer, Timestamp creationTime, Timestamp deliveryTime, OrderStatus status) {
        this.id = id;
        this.amount = amount;
        this.customer = customer;
        this.creationTime = creationTime;
        this.deliveryTime = deliveryTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public Timestamp getDeliveryTime() {
        return deliveryTime;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + getId() +
                ", amount="+ getAmount() +
                ", customer=" + getCustomer() +
                ", creationTime=" + getCreationTime() +
                ", deliveryTime=" + getDeliveryTime() +
                ", status=" + getStatus() +
                '}';
    }
}
