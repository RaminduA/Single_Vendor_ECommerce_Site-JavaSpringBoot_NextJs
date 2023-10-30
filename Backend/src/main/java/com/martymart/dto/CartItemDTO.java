package com.martymart.dto;

import com.martymart.entity.Product;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CartItemDTO {
    private String cart_item_id;
    private CartDTO cart;
    private Product product;
    private int quantity;
    private BigDecimal price;
}