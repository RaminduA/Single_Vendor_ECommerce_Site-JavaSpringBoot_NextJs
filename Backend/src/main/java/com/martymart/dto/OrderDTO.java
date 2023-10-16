package com.martymart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OrderDTO {
    private String order_id;
    private String customer_id;
    private LocalDate order_date;
    private LocalTime order_time;
    private double total_price;
}
