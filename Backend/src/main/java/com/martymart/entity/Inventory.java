package com.martymart.entity;

/*
Inventory Table:
- inventory_id (varchar, primary key)
- product_id (varchar, foreign key)
- warehouse_id (varchar, foreign key)
- count (int)
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
public class Inventory {
    @Id
    private String inventory_id;
    private String product_id;
    private String warehouse_id;
    private int count;
}