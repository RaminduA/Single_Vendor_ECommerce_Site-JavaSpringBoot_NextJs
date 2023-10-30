package com.martymart.entity;

/*
Cart Table:
- cart_id (varchar, primary key)
- customer_id (varchar, foreign key)
- total_price (decimal)
*/

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Cart {
    @Id
    @Column(length = 10)
    private String cart_id;
    @JoinColumn(name = "customer_id")
    @OneToOne(fetch = FetchType.EAGER)
    private Customer customer;
    @Column(precision = 8, scale = 2)
    private BigDecimal total_price;
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<CartItem> cartItems;

    public Cart(String cart_id, Customer customer, BigDecimal total_price) {
        this.cart_id = cart_id;
        this.customer = customer;
        this.total_price = total_price;
        this.cartItems = new ArrayList<CartItem>();
    }
}