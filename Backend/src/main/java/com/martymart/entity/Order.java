package com.martymart.entity;

/*
Orders Table:
- order_id (varchar, primary key)
- customer_id (varchar, foreign key)
- order_date (datetime)
- order_time (datetime)
- total_price (decimal)
*/

public class Order {
    private String order_id;
    private String customer_id;
    private String order_date;
    private String order_time;
    private double total_price;

    public Order() {
    }

    public Order(String order_id, String customer_id, String order_date, String order_time, double total_price) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.order_date = order_date;
        this.order_time = order_time;
        this.total_price = total_price;
    }

    public String get_order_id() {
        return order_id;
    }

    public String get_customer_id() {
        return customer_id;
    }

    public String get_order_date() {
        return order_date;
    }

    public String get_order_time() {
        return order_time;
    }

    public double get_total_price() {
        return total_price;
    }

    public void set_order_id(String order_id) {
        this.order_id = order_id;
    }

    public void set_customer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void set_order_date(String order_date) {
        this.order_date = order_date;
    }

    public void set_order_time(String order_time) {
        this.order_time = order_time;
    }

    public void set_total_price(double total_price) {
        this.total_price = total_price;
    }

    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", customer_id=" + customer_id + ", order_date=" + order_date + ", order_time=" + order_time + ", total_price=" + total_price + '}';
    }
}
