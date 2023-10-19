package com.martymart.entity;

/*
Reviews Table:
- review_id (varchar, primary key)
- product_id (varchar, foreign key)
- customer_id (varchar, foreign key)
- rating (int)
- review (varchar)
- review_date (date)
- review_time (time)
*/

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Review {
    @Id
    @Column(length = 12)
    private String review_id;
    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;
    @JoinColumn(name = "customer_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;
    @Column(nullable = false)
    private int rating;
    private String review;
    private LocalDate review_date;
    private LocalTime review_time;
}
