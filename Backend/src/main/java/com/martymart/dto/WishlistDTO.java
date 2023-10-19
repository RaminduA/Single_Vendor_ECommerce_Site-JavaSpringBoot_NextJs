package com.martymart.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class WishlistDTO {
    private String wishlist_id;
    private CustomerDTO customer;
    private BigDecimal price;
    @ToString.Exclude
    private List<WishlistItemDTO> wishlistItems;

    public WishlistDTO(String wishlist_id, CustomerDTO customer, BigDecimal price) {
        this.wishlist_id = wishlist_id;
        this.customer = customer;
        this.price = price;
        this.wishlistItems = new ArrayList<WishlistItemDTO>();
    }
}
