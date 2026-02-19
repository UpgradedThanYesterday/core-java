package com.upgradadedthanyesterday.java.util.stream.filter.problem11;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public class FindFirstSuccessfulTransaction {
    public static void main(String[] args) {
        // customer details
        Customer alice = new Customer(1, "Alice Johnson", "123 Main St", "California");
        Customer bob = new Customer(2, "Bob Martinez", "456 Oak Ave", "California");
        Customer carol = new Customer(3, "Carol Singh", "789 Pine Rd", "California");
        Customer david = new Customer(4, "David Lee", "321 Elm St", "California");
        Customer eve = new Customer(5, "Eve Turner", "12 Market Pl", "California");
        Customer frank = new Customer(6, "Frank Moore", "99 River Rd", "California");

        // order details
        Order aliceOrder = new Order(1, 950.00, alice, Timestamp.valueOf("2026-02-10 10:00:00"), Timestamp.valueOf("2026-02-12 14:30:00"), OrderStatus.DELIVERED);
        Order bobOrder = new Order(2, 7200.50, bob, Timestamp.valueOf("2026-02-12 09:15:00"), null, OrderStatus.PENDING);
        Order carolOrder = new Order(3, 150.00, carol, Timestamp.valueOf("2026-02-13 11:20:00"), null, OrderStatus.PENDING);
        Order davidOrder = new Order(4, 450.00, david, Timestamp.valueOf("2026-02-08 08:00:00"), Timestamp.valueOf("2026-02-09 12:00:00"), OrderStatus.DELIVERED);
        Order eveOrder = new Order(5, 8200.75, eve, Timestamp.valueOf("2026-02-14 15:00:00"), null, OrderStatus.PENDING);
        Order frankOrder = new Order(6, 1500.00, frank, Timestamp.valueOf("2026-02-15 13:30:00"), null, OrderStatus.PENDING);

        // Transaction details
        Transaction aliceTransaction = new Transaction(1, aliceOrder, "TXN1001", PaymentMethod.CREDIT_CARD,
                950.00, TransactionStatus.SUCCESS, Timestamp.valueOf("2026-02-10 10:05:00"), "Paid successfully");
        Transaction bobTransaction = new Transaction(2, bobOrder, "TXN1002", PaymentMethod.UPI,
                7200.50, TransactionStatus.FAILED, Timestamp.valueOf("2026-02-12 09:20:00"), "Insufficient balance");
        Transaction carolTransaction = new Transaction(3, carolOrder, "TXN1003", PaymentMethod.DEBIT_CARD,
                150.00, TransactionStatus.PENDING, Timestamp.valueOf("2026-02-13 11:25:00"), "Awaiting confirmation");
        Transaction davidTransaction = new Transaction(4, davidOrder, "TXN1004", PaymentMethod.NET_BANKING,
                450.00, TransactionStatus.SUCCESS, Timestamp.valueOf("2026-02-08 08:10:00"), "Paid successfully");
        Transaction eveTransaction = new Transaction(5, eveOrder, "TXN1005", PaymentMethod.UPI,
                8200.75, TransactionStatus.FAILED, Timestamp.valueOf("2026-02-14 15:10:00"), "Payment timeout");
        Transaction frankTransaction = new Transaction(6, frankOrder, "TXN1006", PaymentMethod.CREDIT_CARD,
                1500.00, TransactionStatus.PENDING, Timestamp.valueOf("2026-02-15 13:35:00"), "Payment processing");


        List<Transaction> transactionList = List.of(aliceTransaction, bobTransaction, carolTransaction, davidTransaction, eveTransaction, frankTransaction);

        Optional<Transaction> txn = transactionList.stream()
                .filter(t -> TransactionStatus.SUCCESS == t.getTransactionStatus())
                .filter(t -> t.getTransactionAmount() < 500)
                .findFirst();

        if(txn.isPresent()) {
            System.out.println(txn.get());
        } else {
            System.out.println("No data found");
        }
    }
}
