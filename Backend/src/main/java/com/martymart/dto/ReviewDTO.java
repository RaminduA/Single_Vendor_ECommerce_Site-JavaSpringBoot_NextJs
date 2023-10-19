package com.martymart.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ReviewDTO {
    private String review_id;
    private ProductDTO product;
    private CustomerDTO customer;
    private int rating;
    private String review;
    private LocalDate review_date;
    private LocalTime review_time;
}
