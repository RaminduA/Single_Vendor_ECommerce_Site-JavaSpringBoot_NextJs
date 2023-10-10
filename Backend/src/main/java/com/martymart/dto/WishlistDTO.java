package com.martymart.dto;

public class WishlistDTO {
    private String wishlist_id;
    private String customer_id;
    private double price;

    public WishlistDTO() {
    }

    public WishlistDTO(String wishlist_id, String customer_id, double price) {
        this.wishlist_id = wishlist_id;
        this.customer_id = customer_id;
        this.price = price;
    }

    public String get_wishlist_id() {
        return wishlist_id;
    }

    public String get_customer_id() {
        return customer_id;
    }

    public double get_price() {
        return price;
    }

    public void set_wishlist_id(String wishlist_id) {
        this.wishlist_id = wishlist_id;
    }

    public void set_customer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void set_price(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wishlist{" +
                "wishlist_id='" + wishlist_id + '\'' +
                ", customer_id='" + customer_id + '\'' +
                ", price=" + price +
                '}';
    }
}
