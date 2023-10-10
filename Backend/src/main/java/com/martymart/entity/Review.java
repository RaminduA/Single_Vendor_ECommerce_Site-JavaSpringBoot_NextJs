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

public class Review {
    private String review_id;
    private String product_id;
    private String customer_id;
    private int rating;
    private String review;
    private String date;

    public Review() {
    }

    public Review(String review_id, String product_id, String customer_id, int rating, String review, String date) {
        this.review_id = review_id;
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.rating = rating;
        this.review = review;
        this.date = date;
    }

    public String get_review_id() {
        return this.review_id;
    }

    public String get_product_id() {
        return this.product_id;
    }

    public String get_customer_id() {
        return this.customer_id;
    }

    public int get_rating() {
        return this.rating;
    }

    public String get_review() {
        return this.review;
    }

    public String get_date() {
        return this.date;
    }

    public void set_review_id(String review_id) {
        this.review_id = review_id;
    }

    public void set_product_id(String product_id) {
        this.product_id = product_id;
    }

    public void set_customer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void set_rating(int rating) {
        this.rating = rating;
    }

    public void set_review(String review) {
        this.review = review;
    }

    public void set_date(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
            " review_id='" + get_review_id() + "'" +
            ", product_id='" + get_product_id() + "'" +
            ", customer_id='" + get_customer_id() + "'" +
            ", rating='" + get_rating() + "'" +
            ", review='" + get_review() + "'" +
            ", date='" + get_date() + "'" +
            "}";
    }
}
