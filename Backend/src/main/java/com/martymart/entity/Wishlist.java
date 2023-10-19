package com.martymart.entity;

/*
Wishlist Table:
- wishlist_id (varchar, primary key)
- customer_id (varchar, foreign key)
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
public class Wishlist {
    @Id
    @Column(length = 10)
    private String wishlist_id;
    @JoinColumn(name = "customer_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;
    @Column(precision = 8, scale = 2)
    private BigDecimal price;
    @OneToMany(mappedBy = "wishlist", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<WishlistItem> wishlistItems;

    public Wishlist(String wishlist_id, Customer customer, BigDecimal price) {
        this.wishlist_id = wishlist_id;
        this.customer = customer;
        this.price = price;
        this.wishlistItems = new ArrayList<WishlistItem>();
    }
}
