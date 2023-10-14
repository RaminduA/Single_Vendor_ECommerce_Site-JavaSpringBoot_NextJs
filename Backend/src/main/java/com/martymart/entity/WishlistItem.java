package com.martymart.entity;

/*
Wishlist Items Table:
- wishlist_item_id (varchar, primary key)
- wishlist_id (varchar, foreign key)
- product_id (varchar, foreign key)
- quantity (int)
- price (decimal)
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class WishlistItem {
    @Id
    private String wishlist_item_id;
    private String wishlist_id;
    private String product_id;
    private int quantity;
    private double price;
}
