package com.upgradadedthanyesterday.java.util.stream.filter.problem12;

import java.time.LocalDate;
import java.util.List;

public class FindAvailableProductsWithDiscount {
    public static void main(String[] args) {
        // product type details
        ProductType dairy = new ProductType(1, "DAIRY", 5);
        ProductType grocery = new ProductType(2, "GROCERY", 10);
        ProductType snacks = new ProductType(3, "SNACKS", 0);
        ProductType electronics = new ProductType(4, "ELECTRONICS", 0);
        ProductType personalCare = new ProductType(5, "PERSONAL_CARE", 8);

        // product details
        Product amulMilk = new Product(1, "Amul Milk 1L", dairy, LocalDate.of(2026, 2, 10), LocalDate.of(2026,2,17), 60.00, 5);
        Product basmatiRice = new Product(2, "Basmati Rice 5kg", grocery, LocalDate.parse("2026-01-15"), LocalDate.parse("2027-01-14"), 550.00, 10);
        Product parleGBiscuits = new Product(3, "Parle-G Biscuits", snacks, LocalDate.parse("2026-02-01"), LocalDate.parse("2026-08-01"), 25.00, 0);
        Product iPhone15 = new Product(4, "iPhone 15", electronics, LocalDate.parse("2025-12-20"), null, 79999.00, 0);
        Product colgateToothpaste = new Product(5, "Colgate Toothpaste", personalCare, LocalDate.parse("2026-01-05"), LocalDate.parse("2028-01-04"), 120.00, 8);

        // List of Products
        List<Product> productList = List.of(amulMilk, basmatiRice, parleGBiscuits, iPhone15, colgateToothpaste);

        productList.stream().filter(product -> product.getManufactureDate().isBefore(product.getExpiryDate()))
                .filter(product -> product.getDiscount() > 0)
                .forEach(System.out::println);
    }
}
