package com.martymart.entity;

/*
Products Table:
- product_id (varchar, primary key)
- category_id (varchar, foreign key)
- product_name (varchar)
- image (blob)
- description (varchar)
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
public class Product {
    @Id
    private String product_id;
    private String category_id;
    private String product_name;
    private String image;
    private String description;
    private double price;
}
