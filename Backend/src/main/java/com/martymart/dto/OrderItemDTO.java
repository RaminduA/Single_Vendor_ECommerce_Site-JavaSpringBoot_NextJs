package com.martymart.dto;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OrderItemDTO {
    private String order_item_id;
    private OrderDTO order;
    private ProductDTO product;
    private int quantity;
    private BigDecimal price;
}
