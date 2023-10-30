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
@Setter
@Entity
@Immutable
@Subselect("" +
        "SELECT\n" +
        "    YEAR(order_date) AS order_year,\n" +
        "    QUARTER(order_date) AS order_quarter,\n" +
        "    SUM(total_price) AS total_sales\n" +
        "FROM\n" +
        "    orders\n" +
        "GROUP BY\n" +
        "    order_year, order_quarter")
public class CustomerOrderReport {
    @Id
    private String product_id;
    private String product_name;
    private String interest_month;
    private int interest_count;
}