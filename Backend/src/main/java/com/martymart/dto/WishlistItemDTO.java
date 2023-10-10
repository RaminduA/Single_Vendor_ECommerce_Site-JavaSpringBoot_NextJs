package com.martymart.dto;

public class WishlistItemDTO {
    private String wishlist_item_id;
    private String wishlist_id;
    private String product_id;
    private int quantity;
    private double price;

    public WishlistItemDTO() {
    }

    public WishlistItemDTO(String wishlist_item_id, String wishlist_id, String product_id, int quantity, double price) {
        this.wishlist_item_id = wishlist_item_id;
        this.wishlist_id = wishlist_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
    }

    public String get_wishlist_item_id() {
        return wishlist_item_id;
    }

    public String get_wishlist_id() {
        return wishlist_id;
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

    public void set_wishlist_item_id(String wishlist_item_id) {
        this.wishlist_item_id = wishlist_item_id;
    }

    public void set_wishlist_id(String wishlist_id) {
        this.wishlist_id = wishlist_id;
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
        return "WishlistItem{" +
                "wishlist_item_id='" + wishlist_item_id + '\'' +
                ", wishlist_id='" + wishlist_id + '\'' +
                ", product_id='" + product_id + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
