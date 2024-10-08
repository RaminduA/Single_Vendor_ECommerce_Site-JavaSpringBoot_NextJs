package com.martymart.repository;

import com.martymart.entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WishlistRepository extends JpaRepository<Wishlist, String> {
    @Query(value = "SELECT wishlist_id FROM wishlist ORDER BY wishlist_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM wishlist WHERE wishlist_id=:id LIMIT 1", nativeQuery = true)
    Wishlist getWishlist(@Param("id")String wishlist_id);

    @Modifying
    @Query(value = "INSERT INTO wishlist (wishlist_id, customer_id, price) VALUES (:#{#wishlist.wishlist_id}, :#{#wishlist.customer.customer_id}, :#{#wishlist.price})", nativeQuery = true)
    void addWishlist(@Param("wishlist")Wishlist wishlist);

    @Modifying
    @Query(value = "UPDATE wishlist SET customer_id=:#{#wishlist.customer.customer_id}, price=:#{#wishlist.price} WHERE wishlist_id=:#{#wishlist.wishlist_id}", nativeQuery = true)
    void updateWishlist(@Param("wishlist")Wishlist wishlist);

    @Modifying
    @Query(value = "DELETE FROM wishlist WHERE wishlist_id=:id", nativeQuery = true)
    void deleteWishlist(@Param("id")String wishlist_id);

    @Query(value = "SELECT * FROM wishlist WHERE customer_id=:id", nativeQuery = true)
    List<Wishlist> getAllWishlistsByCustomer(@Param("id")String customer_id);

    @Query(value = "SELECT * FROM wishlist", nativeQuery = true)
    List<Wishlist> getAllWishlists();

    @Query(value = "SELECT COUNT(*)>0 FROM wishlist WHERE wishlist_id=:id", nativeQuery = true)
    Boolean isWishlistExists(@Param("id")String wishlist_id);
}
