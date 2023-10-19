package com.martymart.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class SubcategoryDTO {
    private String subcategory_id;
    private String subcategory_name;
    private CategoryDTO category;
    @ToString.Exclude
    private List<ProductDTO> products;

    public SubcategoryDTO(String subcategory_id, String subcategory_name, CategoryDTO category) {
        this.subcategory_id = subcategory_id;
        this.subcategory_name = subcategory_name;
        this.category = category;
        this.products = new ArrayList<ProductDTO>();
    }
}
