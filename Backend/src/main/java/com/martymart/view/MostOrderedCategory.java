package com.martymart.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Immutable
@Subselect("" +
        "SELECT\n" +
        "    c.category_id,\n" +
        "    c.category_name,\n" +
        "    COUNT(DISTINCT o.order_id) AS order_count\n" +
        "FROM\n" +
        "    category c\n" +
        "LEFT JOIN\n" +
        "    subcategory sc ON c.category_id = sc.parent_category_id\n" +
        "LEFT JOIN\n" +
        "    product p ON sc.subcategory_id = p.parent_category_id\n" +
        "LEFT JOIN\n" +
        "    order_item oi ON p.product_id = oi.product_id\n" +
        "LEFT JOIN\n" +
        "    orders o ON oi.order_id = o.order_id\n" +
        "GROUP BY\n" +
        "    c.category_id, c.category_name\n" +
        "ORDER BY\n" +
        "    order_count DESC")
public class MostOrderedCategory {
    @Id
    private String category_id;
    private String category_name;
    private int order_count;
}