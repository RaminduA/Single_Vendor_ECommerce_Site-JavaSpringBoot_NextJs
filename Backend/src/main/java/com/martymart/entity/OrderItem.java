package com.martymart.entity;

/*
Order_Items Table:
- order_item_id (varchar, primary key)
- order_id (varchar, foreign key)
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
public class OrderItem {
    @Id
    @Column(length = 12)
    private String order_item_id;
    @JoinColumn(name = "order_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Order order;
    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;
    private int quantity;
    @Column(precision = 8, scale = 2)
    private BigDecimal price;
}
