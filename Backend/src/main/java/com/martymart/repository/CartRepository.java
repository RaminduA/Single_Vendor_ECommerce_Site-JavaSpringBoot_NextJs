package com.martymart.repository;

import com.martymart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartRepository extends JpaRepository<Cart, String> {
    @Query(value = "SELECT cart_id FROM cart ORDER BY cart_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM cart WHERE cart_id=:id LIMIT 1", nativeQuery = true)
    Cart getCart(@Param("id")String cart_id);

    @Modifying
    @Query(value = "INSERT INTO cart (cart_id, customer_id, total_price) VALUES (:#{#cart.cart_id}, :#{#cart.customer.customer_id}, :#{#cart.total_price})", nativeQuery = true)
    void saveCart(@Param("cart")Cart cart);

    @Modifying
    @Query(value = "UPDATE cart SET customer_id=:#{#cart.customer.customer_id}, total_price=:#{#cart.total_price} WHERE cart_id=:#{#cart.cart_id}", nativeQuery = true)
    void updateCart(@Param("cart")Cart cart);

    @Modifying
    @Query(value = "DELETE FROM cart WHERE cart_id=:id", nativeQuery = true)
    void deleteCart(@Param("id")String cart_id);

    @Query(value = "SELECT * FROM cart WHERE customer_id=:id LIMIT 1", nativeQuery = true)
    Cart getCartByCustomer(@Param("id")String customer_id);
}
