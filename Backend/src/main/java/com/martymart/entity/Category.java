package com.martymart.entity;

/*
Categories Table:
- category_id (varchar, primary key)
- category_name (varchar)
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
public class Category {
    @Id
    private String category_id;
    private String category_name;
}
