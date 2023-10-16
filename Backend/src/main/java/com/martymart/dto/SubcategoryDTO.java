package com.martymart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class SubcategoryDTO {
    private String subcategory_id;
    private String subcategory_name;
    private String parent_category_id;
}
