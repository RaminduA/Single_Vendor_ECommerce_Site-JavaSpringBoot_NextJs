package com.martymart.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CartDTO {
    private String cart_id;
    private CustomerDTO customer;
    private BigDecimal total_price;
    @ToString.Exclude
    private List<CartItemDTO> cartItems;

    public CartDTO(String cart_id, CustomerDTO customer, BigDecimal total_price) {
        this.cart_id = cart_id;
        this.customer = customer;
        this.total_price = total_price;
        this.cartItems = new ArrayList<CartItemDTO>();
    }
}