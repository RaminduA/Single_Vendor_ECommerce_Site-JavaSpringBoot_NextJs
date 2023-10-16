package com.martymart.repository;

import com.martymart.entity.WishlistItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WishlistItemRepository extends JpaRepository<WishlistItem, String> {
    @Query(value = "SELECT * FROM wishlist_item WHERE wishlist_item_id=:id LIMIT 1", nativeQuery = true)
    WishlistItem getWishlistItem(@Param("id")String wishlist_item_id);

    @Query(value = "INSERT INTO wishlist_item VALUES (:#{#wishlistItem.wishlist_item_id}, :#{#wishlistItem.wishlist_id}, :#{#wishlistItem.product_id}, :#{#wishlistItem.quantity}, :#{#wishlistItem.price})", nativeQuery = true)
    void saveWishlistItem(@Param("wishlistItem")WishlistItem wishlistItem);

    @Query(value = "UPDATE wishlist_item SET wishlist_id=:#{#wishlistItem.wishlist_id}, product_id=:#{#wishlistItem.product_id}, quantity=:#{#wishlistItem.quantity}, price=:#{#wishlistItem.price} WHERE wishlist_item_id=:#{#wishlistItem.wishlist_item_id}", nativeQuery = true)
    void updateWishlistItem(@Param("wishlistItem")WishlistItem wishlistItem);

    @Query(value = "DELETE FROM wishlist_item WHERE wishlist_item_id=:id", nativeQuery = true)
    void deleteWishlistItem(@Param("id")String wishlist_item_id);

    @Query(value = "SELECT * FROM wishlist_item WHERE wishlist_id=:id", nativeQuery = true)
    List<WishlistItem> getAllByWishlist(@Param("id")String wishlist_id);
}
