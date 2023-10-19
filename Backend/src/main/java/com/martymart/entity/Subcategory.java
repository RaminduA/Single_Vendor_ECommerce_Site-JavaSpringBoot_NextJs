package com.martymart.entity;

/*
Subcategories Table:
- subcategory_id (varchar, primary key)
- subcategory_name (varchar)
- parent_category_id (varchar, foreign key)
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
public class Subcategory {
    @Id
    @Column(length = 8)
    private String subcategory_id;
    @Column(nullable = false, length = 20)
    private String subcategory_name;
    @JoinColumn(name = "parent_category_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;
    @OneToMany(mappedBy = "subcategory", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<Product> products;

    public Subcategory(String subcategory_id, String subcategory_name, Category category) {
        this.subcategory_id = subcategory_id;
        this.subcategory_name = subcategory_name;
        this.category = category;
        this.products = new ArrayList<Product>();
    }
}
