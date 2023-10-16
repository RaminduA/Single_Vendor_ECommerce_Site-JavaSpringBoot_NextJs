package com.martymart.entity;

/*
Orders Table:
- order_id (varchar, primary key)
- customer_id (varchar, foreign key)
- order_date (datetime)
- order_time (datetime)
- total_price (decimal)
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "orders")
public class Order {
    @Id
    private String order_id;
    private String customer_id;
    private LocalDate order_date;
    private LocalTime order_time;
    private double total_price;
}
