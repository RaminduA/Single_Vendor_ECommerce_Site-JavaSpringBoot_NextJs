package com.martymart.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CustomerDTO {
    private String customer_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    @ToString.Exclude
    private List<OrderDTO> orders;
    @ToString.Exclude
    private List<WishlistDTO> wishlists;
    @ToString.Exclude
    private List<ReviewDTO> reviews;

    public CustomerDTO(String customer_id, String first_name, String last_name, String email, String phone_number) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.orders = new ArrayList<OrderDTO>();
        this.wishlists = new ArrayList<WishlistDTO>();
        this.reviews = new ArrayList<ReviewDTO>();
    }
}
