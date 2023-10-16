package com.martymart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ProductDTO {
    private String product_id;
    private String parent_category_id;
    private String product_name;
    private String image;
    private String description;
    private double price;
}
