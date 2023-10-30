package com.martymart.entity;

/*
Products Table:
- product_id (varchar, primary key)
- parent_category_id (varchar, foreign key)
- product_name (varchar)
- image (varchar)
- description (varchar)
- price (decimal)
*/

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Product {
    @Id
    @Column(length = 10)
    private String product_id;
    @JoinColumn(name = "parent_category_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Subcategory subcategory;
    @Column(nullable = false, length = 50)
    private String product_name;
    @Column(nullable = false, length = 100)
    private String image;
    private String description;
    @Column(precision = 8, scale = 2)
    private BigDecimal price;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<OrderItem> orderItems;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<CartItem> cartItems;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<WishlistItem> wishlistItems;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<Inventory> inventories;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<Review> reviews;

    public Product(String product_id, Subcategory subcategory, String product_name, String image, String description, BigDecimal price) {
        this.product_id = product_id;
        this.subcategory = subcategory;
        this.product_name = product_name;
        this.image = image;
        this.description = description;
        this.price = price;
        this.orderItems = new ArrayList<OrderItem>();
        this.cartItems = new ArrayList<CartItem>();
        this.wishlistItems = new ArrayList<WishlistItem>();
        this.inventories = new ArrayList<Inventory>();
        this.reviews = new ArrayList<Review>();
    }
}
