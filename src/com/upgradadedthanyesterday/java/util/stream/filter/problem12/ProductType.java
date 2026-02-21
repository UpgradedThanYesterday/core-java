package com.upgradadedthanyesterday.java.util.stream.filter.problem12;

public class ProductType {
    private final int id;
    private final String name;
    private final double discountPercentage;

    public ProductType(int id, String name, double discountPercentage) {
        this.id = id;
        this.name = name;
        this.discountPercentage = discountPercentage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", discountPercentage=" + getDiscountPercentage() +
                '}';
    }
}
