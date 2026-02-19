package com.upgradadedthanyesterday.java.util.stream.filter.problem11;

import java.sql.Timestamp;

public class Transaction {
    private final int id;
    private final Order order;
    private final String transactionRef;
    private final PaymentMethod paymentMethod;
    private final double transactionAmount;
    private final TransactionStatus transactionStatus;
    private final Timestamp transactionDate;
    private final String remarks;

    public Transaction(int id, Order order, String transactionRef, PaymentMethod paymentMethod, double transactionAmount, TransactionStatus transactionStatus, Timestamp transactionDate, String remarks) {
        this.id = id;
        this.order = order;
        this.transactionRef = transactionRef;
        this.paymentMethod = paymentMethod;
        this.transactionAmount = transactionAmount;
        this.transactionStatus = transactionStatus;
        this.transactionDate = transactionDate;
        this.remarks = remarks;
    }

    public int getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public String getTransactionRef() {
        return transactionRef;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public String getRemarks() {
        return remarks;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + getId() +
                ", order=" + getOrder() +
                ", transactionRef='" + getTransactionRef() + '\'' +
                ", paymentMethod='" + getPaymentMethod() + '\'' +
                ", transactionAmount=" + getTransactionAmount() +
                ", transactionStatus='" + getTransactionStatus() + '\'' +
                ", transactionDate=" + getTransactionDate() +
                ", remarks='" + getRemarks() + '\'' +
                '}';
    }
}
