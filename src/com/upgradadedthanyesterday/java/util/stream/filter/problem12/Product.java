package com.upgradadedthanyesterday.java.util.stream.filter.problem12;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private final int id;
    private final String name;
    private final ProductType productType;
    private final LocalDate manufactureDate;
    private final LocalDate expiryDate;
    private final double unitPrice;
    private final double discount;

    public Product(int id, String name, ProductType productType, LocalDate manufactureDate, LocalDate expiryDate, double unitPrice, double discount) {
        this.id = id;
        this.name = name;
        this.productType = productType;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public LocalDate getExpiryDate() {
        return Objects.isNull(expiryDate) ? LocalDate.now() : expiryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Apply the maximum discount between the product's own discount and the discount percentage of the product type.
     */
    public double getDiscount() {
        return Math.max(discount, productType.getDiscountPercentage());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", productType=" + getProductType() +
                ", manufactureDate='" + getManufactureDate() + '\'' +
                ", expiryDate='" + getExpiryDate() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", discount=" + getDiscount() +
                '}';
    }
}
