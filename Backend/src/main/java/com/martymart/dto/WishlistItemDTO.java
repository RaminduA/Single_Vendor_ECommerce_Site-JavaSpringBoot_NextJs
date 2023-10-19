package com.martymart.dto;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class WishlistItemDTO {
    private String wishlist_item_id;
    private WishlistDTO wishlist;
    private ProductDTO product;
    private int quantity;
    private BigDecimal price;
}
