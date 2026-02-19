package com.upgradadedthanyesterday.java.util.stream.filter.problem11;

/**
 * Customer details
 */
public class Customer {
    private final int id;
    private final String name;
    private final Address address;

    public Customer(int id, String name, String city, String state) {
        this.id = id;
        this.name = name;
        this.address = new Address(city, state);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public static class Address {
        public String city;
        public String state;

        public Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        @Override
        public String toString() {
            return "city : "+getCity()+
                    ", state : "+getState();
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", address=" + getAddress() +
                '}';
    }
}
