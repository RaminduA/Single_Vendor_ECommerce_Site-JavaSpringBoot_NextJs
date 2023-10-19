package com.martymart.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OrderDTO {
    private String order_id;
    private CustomerDTO customer;
    private LocalDate order_date;
    private LocalTime order_time;
    private BigDecimal total_price;
    @ToString.Exclude
    private List<OrderItemDTO> orderItems;

    public OrderDTO(String order_id, CustomerDTO customer, LocalDate order_date, LocalTime order_time, BigDecimal total_price) {
        this.order_id = order_id;
        this.customer = customer;
        this.order_date = order_date;
        this.order_time = order_time;
        this.total_price = total_price;
        this.orderItems = new ArrayList<OrderItemDTO>();
    }
}
