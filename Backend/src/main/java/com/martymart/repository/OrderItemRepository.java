package com.martymart.repository;

import com.martymart.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {
    @Query(value = "SELECT * FROM order_item WHERE order_item_id=:id LIMIT 1", nativeQuery = true)
    OrderItem getOrderItem(@Param("id")String order_item_id);

    @Modifying
    @Query(value = "INSERT INTO order_item (order_item_id, order_id, product_id, quantity, price) VALUES (:#{#order_item.order_item_id}, :#{#order_item.order_id}, :#{#order_item.product_id}, :#{#order_item.quantity}, :#{#order_item.price})", nativeQuery = true)
    void saveOrderItem(@Param("order_item")OrderItem order_item);

    @Modifying
    @Query(value = "UPDATE order_item SET order_id=:#{#order_item.order_id}, product_id=:#{#order_item.product_id}, quantity=:#{#order_item.quantity}, price=:#{#order_item.price} WHERE order_item_id=:#{#order_item.order_item_id}", nativeQuery = true)
    void updateOrderItem(@Param("order_item")OrderItem order_item);

    @Modifying
    @Query(value = "DELETE FROM order_item WHERE order_item_id=:id", nativeQuery = true)
    void deleteOrderItem(@Param("id")String order_item_id);

    @Query(value = "SELECT * FROM order_item WHERE order_id=:id", nativeQuery = true)
    List<OrderItem> getOrderItemByOrderId(@Param("id")String order_id);
}
