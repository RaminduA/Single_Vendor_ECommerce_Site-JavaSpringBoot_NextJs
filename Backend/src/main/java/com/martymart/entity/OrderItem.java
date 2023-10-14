package com.martymart.entity;

/*
Order_Items Table:
- order_item_id (varchar, primary key)
- order_id (varchar, foreign key)
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
public class OrderItem {
    @Id
    private String order_item_id;
    private String order_id;
    private String product_id;
    private int quantity;
    private double price;
}
