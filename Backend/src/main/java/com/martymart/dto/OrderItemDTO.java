package com.martymart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OrderItemDTO {
    private String order_item_id;
    private String order_id;
    private String product_id;
    private int quantity;
    private double price;
}
