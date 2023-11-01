package com.martymart.repository;

import com.martymart.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String> {
    @Query(value = "SELECT order_id FROM orders ORDER BY order_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM orders WHERE order_id=:id LIMIT 1", nativeQuery = true)
    Order getOrder(@Param("id")String order_id);

    @Modifying
    @Query(value = "INSERT INTO orders (order_id, customer_id, order_date, order_time, total_price) VALUES (:#{#order.order_id}, :#{#order.customer.customer_id}, :#{#order.order_date}, :#{#order.order_time}, :#{#order.total_price})", nativeQuery = true)
    void saveOrder(@Param("order")Order order);

    @Modifying
    @Query(value = "UPDATE orders SET customer_id=:#{#order.customer.customer_id}, order_date=:#{#order.order_date}, order_time=:#{#order.order_time}, total_price=:#{#order.total_price} WHERE order_id=:#{#order.order_id}", nativeQuery = true)
    void updateOrder(@Param("order")Order order);

    @Modifying
    @Query(value = "DELETE FROM orders WHERE order_id=:id", nativeQuery = true)
    void deleteOrder(@Param("id")String order_id);

    @Query(value = "SELECT * FROM orders WHERE customer_id=:id", nativeQuery = true)
    List<Order> getAllOrdersByCustomer(@Param("id")String customer_id);

    @Query(value = "SELECT COUNT(*)>0 FROM orders WHERE order_id=:id", nativeQuery = true)
    Boolean isOrderExists(@Param("id")String order_id);
}
