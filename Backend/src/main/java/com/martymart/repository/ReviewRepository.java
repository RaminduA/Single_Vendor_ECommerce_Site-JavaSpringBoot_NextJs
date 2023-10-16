package com.martymart.repository;

import com.martymart.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, String> {
    @Query(value = "SELECT * FROM review WHERE review_id=:id LIMIT 1", nativeQuery = true)
    Review getReview(@Param("id")String review_id);

    @Query(value = "INSERT INTO review VALUES (:#{#review.review_id}, :#{#review.product_id}, :#{#review.customer_id}, :#{#review.rating}, :#{#review.review}, :#{#review.review_date}, :#{#review.review_time})", nativeQuery = true)
    void saveReview(@Param("review")Review review);

    @Query(value = "UPDATE review SET product_id=:#{#review.product_id}, customer_id=:#{#review.customer_id}, rating=:#{#review.rating}, review=:#{#review.review}, review_date=:#{#review.review_date}, review_time=:#{#review.review_time} WHERE review_id=:#{#review.review_id}", nativeQuery = true)
    void updateReview(@Param("review")Review review);

    @Query(value = "DELETE FROM review WHERE review_id=:id", nativeQuery = true)
    void deleteReview(@Param("id")String review_id);

    @Query(value = "SELECT * FROM review WHERE product_id=:id", nativeQuery = true)
    List<Review> getAllByProduct(@Param("id")String product_id);

    @Query(value = "SELECT * FROM review WHERE customer_id=:id", nativeQuery = true)
    List<Review> getAllByCustomer(@Param("id")String customer_id);
}
