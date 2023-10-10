package com.martymart.entity;

/*
Order_Items Table:
- order_item_id (varchar, primary key)
- order_id (varchar, foreign key)
- product_id (varchar, foreign key)
- quantity (int)
- price (decimal)
*/

public class OrderItem {
    private String order_item_id;
    private String order_id;
    private String product_id;
    private int quantity;
    private double price;

    public OrderItem() {
    }

    public OrderItem(String order_item_id, String order_id, String product_id, int quantity, double price) {
        this.order_item_id = order_item_id;
        this.order_id = order_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
    }

    public String get_order_item_id() {
        return order_item_id;
    }

    public String get_order_id() {
        return order_id;
    }

    public String get_product_id() {
        return product_id;
    }

    public int get_quantity() {
        return quantity;
    }

    public double get_price() {
        return price;
    }

    public void set_order_item_id(String order_item_id) {
        this.order_item_id = order_item_id;
    }

    public void set_order_id(String order_id) {
        this.order_id = order_id;
    }

    public void set_product_id(String product_id) {
        this.product_id = product_id;
    }

    public void set_quantity(int quantity) {
        this.quantity = quantity;
    }

    public void set_price(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "order_item_id='" + order_item_id + '\'' +
                ", order_id='" + order_id + '\'' +
                ", product_id='" + product_id + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
