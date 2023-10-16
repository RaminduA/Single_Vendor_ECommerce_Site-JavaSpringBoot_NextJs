package com.martymart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ReviewDTO {
    private String review_id;
    private String product_id;
    private String customer_id;
    private int rating;
    private String review;
    private LocalDate review_date;
    private LocalTime review_time;
}
