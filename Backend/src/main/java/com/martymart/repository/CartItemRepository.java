package com.martymart.repository;

import com.martymart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, String> {
    @Query(value = "SELECT cart_item_id FROM cart_item ORDER BY cart_item_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM cart_item WHERE cart_item_id=:id LIMIT 1", nativeQuery = true)
    CartItem getCartItem(@Param("id")String cart_item_id);

    @Modifying
    @Query(value = "INSERT INTO cart_item (cart_item_id, cart_id, product_id, quantity, price) VALUES (:#{#cart_item.cart_item_id}, :#{#cart_item.cart.cart_id}, :#{#cart_item.product.product_id}, :#{#cart_item.quantity}, :#{#cart_item.price})", nativeQuery = true)
    void saveCartItem(@Param("cart_item")CartItem cart_item);

    @Modifying
    @Query(value = "UPDATE cart_item SET cart_id=:#{#cart_item.cart.cart_id}, product_id=:#{#cart_item.product.product_id}, quantity=:#{#cart_item.quantity}, price=:#{#cart_item.price} WHERE cart_item_id=:#{#cart_item.cart_item_id}", nativeQuery = true)
    void updateCartItem(@Param("cart_item")CartItem cart_item);

    @Modifying
    @Query(value = "DELETE FROM cart_item WHERE cart_item_id=:id", nativeQuery = true)
    void deleteCartItem(@Param("id")String cart_item_id);

    @Query(value = "SELECT * FROM cart_item WHERE cart_id=:id", nativeQuery = true)
    List<CartItem> getAllCartItemsByCart(@Param("id")String cart_id);
}
