package com.martymart.entity;

/*
Subcategories Table:
- subcategory_id (varchar, primary key)
- subcategory_name (varchar)
- parent_category_id (varchar, foreign key)
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
public class Subcategory {
    @Id
    private String subcategory_id;
    private String subcategory_name;
    private String parent_category_id;
}
