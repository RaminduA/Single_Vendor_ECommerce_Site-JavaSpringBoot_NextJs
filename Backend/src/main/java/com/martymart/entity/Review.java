package com.martymart.entity;

/*
Reviews Table:
- review_id (varchar, primary key)
- product_id (varchar, foreign key)
- customer_id (varchar, foreign key)
- rating (int)
- review (varchar)
- date (date)
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Review {
    @Id
    private String review_id;
    private String product_id;
    private String customer_id;
    private int rating;
    private String review;
    private String date;
}
