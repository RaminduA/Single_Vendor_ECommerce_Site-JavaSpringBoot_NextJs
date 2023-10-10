package com.martymart.dto;

public class ProductDTO {
    private String product_id;
    private String category_id;
    private String product_name;
    private String image;
    private String description;
    private double price;

    public ProductDTO() {
    }

    public ProductDTO(String product_id, String category_id, String product_name, String image, String description, double price) {
        this.product_id = product_id;
        this.category_id = category_id;
        this.product_name = product_name;
        this.image = image;
        this.description = description;
        this.price = price;
    }

    public String get_product_id() {
        return product_id;
    }

    public String get_category_id() {
        return category_id;
    }

    public String get_product_name() {
        return product_name;
    }

    public String get_image() {
        return image;
    }

    public String get_description() {
        return description;
    }

    public double get_price() {
        return price;
    }

    public void set_product_id(String product_id) {
        this.product_id = product_id;
    }

    public void set_category_id(String category_id) {
        this.category_id = category_id;
    }

    public void set_product_name(String product_name) {
        this.product_name = product_name;
    }

    public void set_image(String image) {
        this.image = image;
    }

    public void set_description(String description) {
        this.description = description;
    }

    public void set_price(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", category_id=" + category_id + ", product_name=" + product_name + ", image=" + image + ", description=" + description + ", price=" + price + '}';
    }

}
