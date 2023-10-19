package com.martymart.entity;

/*
Customers Table:
- customer_id (varchar, primary key)
- first_name (varchar)
- last_name (varchar)
- email (varchar)
- phone_number (varchar)
*/

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Customer {
    @Id
    @Column(length = 10)
    private String customer_id;
    @Column(nullable = false, length = 15)
    private String first_name;
    @Column(nullable = false, length = 15)
    private String last_name;
    @Column(length = 40)
    private String email;
    @Column(length = 15)
    private String phone_number;
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Order> orders;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<Wishlist> wishlists;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<Review> reviews;

    public Customer(String customer_id, String first_name, String last_name, String email, String phone_number) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.orders = new ArrayList<Order>();
        this.wishlists = new ArrayList<Wishlist>();
        this.reviews = new ArrayList<Review>();
    }
}
