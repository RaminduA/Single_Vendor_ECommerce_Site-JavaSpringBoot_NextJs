package com.martymart.entity;

/*
Wishlist Table:
- wishlist_id (varchar, primary key)
- customer_id (varchar, foreign key)
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
public class Wishlist {
    @Id
    private String wishlist_id;
    private String customer_id;
    private double price;
}
