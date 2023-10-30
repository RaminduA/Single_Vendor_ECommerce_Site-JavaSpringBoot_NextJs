package com.martymart.repository;

import com.martymart.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, String> {
    @Query(value = "SELECT review_id FROM review ORDER BY review_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM review WHERE review_id=:id LIMIT 1", nativeQuery = true)
    Review getReview(@Param("id")String review_id);

    @Modifying
    @Query(value = "INSERT INTO review (review_id, product_id, customer_id, rating, review, review_date, review_time) VALUES (:#{#review.review_id}, :#{#review.product.product_id}, :#{#review.customer.customer_id}, :#{#review.rating}, :#{#review.review}, :#{#review.review_date}, :#{#review.review_time})", nativeQuery = true)
    void saveReview(@Param("review")Review review);

    @Modifying
    @Query(value = "UPDATE review SET product_id=:#{#review.product.product_id}, customer_id=:#{#review.customer.customer_id}, rating=:#{#review.rating}, review=:#{#review.review}, review_date=:#{#review.review_date}, review_time=:#{#review.review_time} WHERE review_id=:#{#review.review_id}", nativeQuery = true)
    void updateReview(@Param("review")Review review);

    @Modifying
    @Query(value = "DELETE FROM review WHERE review_id=:id", nativeQuery = true)
    void deleteReview(@Param("id")String review_id);

    @Query(value = "SELECT * FROM review WHERE product_id=:id", nativeQuery = true)
    List<Review> getAllReviewsByProduct(@Param("id")String product_id);

    @Query(value = "SELECT * FROM review WHERE customer_id=:id", nativeQuery = true)
    List<Review> getAllReviewsByCustomer(@Param("id")String customer_id);
}
