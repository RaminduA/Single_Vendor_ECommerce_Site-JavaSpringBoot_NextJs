package com.martymart.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CategoryDTO {
    private String category_id;
    private String category_name;
    @ToString.Exclude
    private List<SubcategoryDTO> subcategories;

    public CategoryDTO(String category_id, String category_name) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.subcategories = new ArrayList<SubcategoryDTO>();
    }
}
