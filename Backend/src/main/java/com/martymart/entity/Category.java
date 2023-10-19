package com.martymart.entity;

/*
Categories Table:
- category_id (varchar, primary key)
- category_name (varchar)
*/

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Category {
    @Id
    @Column(length = 8)
    private String category_id;
    @Column(nullable = false, length = 15)
    private String category_name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<Subcategory> subcategories;

    public Category(String category_id, String category_name) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.subcategories = new ArrayList<Subcategory>();
    }
}
