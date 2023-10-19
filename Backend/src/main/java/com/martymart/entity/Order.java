package com.martymart.entity;

/*
Orders Table:
- order_id (varchar, primary key)
- customer_id (varchar, foreign key)
- order_date (date)
- order_time (time)
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
@Table(name = "orders")
public class Order {
    @Id
    @Column(length = 10)
    private String order_id;
    @JoinColumn(name = "customer_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;
    private LocalDate order_date;
    private LocalTime order_time;
    @Column(precision = 8, scale = 2)
    private BigDecimal total_price;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<OrderItem> orderItems;

    public Order(String order_id, Customer customer, LocalDate order_date, LocalTime order_time, BigDecimal total_price) {
        this.order_id = order_id;
        this.customer = customer;
        this.order_date = order_date;
        this.order_time = order_time;
        this.total_price = total_price;
        this.orderItems = new ArrayList<OrderItem>();
    }
}
