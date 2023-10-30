package com.martymart.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ProductDTO {
    private String product_id;
    private SubcategoryDTO subcategory;
    private String product_name;
    private String image;
    private String description;
    private BigDecimal price;
    @ToString.Exclude
    private List<OrderItemDTO> orderItems;
    @ToString.Exclude
    private List<CartItemDTO> cartItems;
    @ToString.Exclude
    private List<WishlistItemDTO> wishlistItems;
    @ToString.Exclude
    private List<InventoryDTO> inventories;
    @ToString.Exclude
    private List<ReviewDTO> reviews;

    public ProductDTO(String product_id, SubcategoryDTO subcategory, String product_name, String image, String description, BigDecimal price) {
        this.product_id = product_id;
        this.subcategory = subcategory;
        this.product_name = product_name;
        this.image = image;
        this.description = description;
        this.price = price;
        this.orderItems = new ArrayList<OrderItemDTO>();
        this.cartItems = new ArrayList<CartItemDTO>();
        this.wishlistItems = new ArrayList<WishlistItemDTO>();
        this.inventories = new ArrayList<InventoryDTO>();
        this.reviews = new ArrayList<ReviewDTO>();
    }
}
