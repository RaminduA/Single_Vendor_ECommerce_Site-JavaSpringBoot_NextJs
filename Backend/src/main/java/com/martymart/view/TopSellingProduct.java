package com.martymart.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
        "    p.product_id,\n" +
        "    p.product_name,\n" +
        "    SUM(oi.quantity) AS total_sales\n" +
        "FROM\n" +
        "    product p\n" +
        "JOIN\n" +
        "    order_item oi ON p.product_id = oi.product_id\n" +
        "JOIN\n" +
        "    orders o ON oi.order_id = o.order_id\n" +
        "WHERE\n" +
        "    o.order_date BETWEEN 'start_date' AND 'end_date' -- Replace 'start_date' and 'end_date' with your desired date range\n" +
        "GROUP BY\n" +
        "    p.product_id, p.product_name\n" +
        "ORDER BY\n" +
        "    total_sales DESC")
public class TopSellingProduct {
    @Id
    private String product_id;
    private String product_name;
    private int total_sales;
}