package com.martymart.entity;

/*
Inventory Table:
- inventory_id (varchar, primary key)
- product_id (varchar, foreign key)
- warehouse_id (varchar, foreign key)
- count (int)
*/

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Inventory {
    @Id
    @Column(length = 10)
    private String inventory_id;
    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;
    @JoinColumn(name = "warehouse_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Warehouse warehouse;
    private int count;
}