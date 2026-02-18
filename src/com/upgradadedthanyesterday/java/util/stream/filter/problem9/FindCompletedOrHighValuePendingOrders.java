package com.upgradadedthanyesterday.java.util.stream.filter.problem9;

import java.sql.Timestamp;
import java.util.List;

public class FindCompletedOrHighValuePendingOrders {
    public static void main(String[] args) {
        /**
         * Orders
         * _______
         * id	|	customer_name	|	amount	|	status	    |	created_at	        |	delivered_at	    |	shipping_address    |
         * 1	|	Alice Johnson	|	950.00	|	DELIVERED	|	2026-02-10 10:00:00	|	2026-02-12 14:30:00	|	123 Main St         |
         * 2	|	Bob Martinez	|	7200.50	|	PENDING	    |	2026-02-12 09:15:00	|	NULL	            |	456 Oak Ave         |
         * 3	|	Carol Singh	    |	150.00	|	PENDING	    |	2026-02-13 11:20:00	|	NULL	            |	789 Pine Rd         |
         * 4	|	David Lee	    |	450.00	|	DELIVERED	|	2026-02-08 08:00:00	|	2026-02-09 12:00:00	|	321 Elm St          |
         * 5	|	Eve Turner	    |	8200.75	|	PENDING	    |	2026-02-14 15:00:00	|	NULL	            |	12 Market Pl        |
         * 6	|	Frank Moore	    |	1500.00	|	PENDING	    |	2026-02-15 13:30:00	|	NULL	            |	99 River Rd         |
         */

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


        List<Order> orderList = List.of(aliceOrder, bobOrder, carolOrder, davidOrder, eveOrder, frankOrder);

        // Filter the orders based on the criteria and print the result
        orderList.stream()
                .filter(order -> OrderStatus.DELIVERED == order.getStatus()
                        || (OrderStatus.PENDING == order.getStatus() && order.getAmount() > 5000.00))
                .forEach(System.out::println);

    }
}
