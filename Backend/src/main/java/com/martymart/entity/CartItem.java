package com.martymart.entity;

/*
Cart_Items Table:
- cart_item_id (varchar, primary key)
- cart_id (varchar, foreign key)
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
public class CartItem {
    @Id
    @Column(length = 12)
    private String cart_item_id;
    @JoinColumn(name = "cart_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Cart cart;
    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;
    private int quantity;
    @Column(precision = 8, scale = 2)
    private BigDecimal price;
}