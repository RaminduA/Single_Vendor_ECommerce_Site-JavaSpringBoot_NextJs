package com.martymart.entity;

/*
Wishlist Items Table:
- wishlist_item_id (varchar, primary key)
- wishlist_id (varchar, foreign key)
- product_id (varchar, foreign key)
- quantity (int)
- price (decimal)
*/

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class WishlistItem {
    @Id
    @Column(length = 12)
    private String wishlist_item_id;
    @JoinColumn(name = "wishlist_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Wishlist wishlist;
    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;
    private int quantity;
    @Column(precision = 8, scale = 2)
    private BigDecimal price;
}
