package com.martymart.repository;

import com.martymart.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Query(value = "SELECT customer_id FROM customer ORDER BY customer_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM customer WHERE customer_id=:id LIMIT 1", nativeQuery = true)
    Customer getCustomer(@Param("id")String customer_id);

    @Modifying
    @Query(value = "INSERT INTO customer (customer_id, first_name, last_name, email, phone_number) VALUES (:#{#customer.customer_id}, :#{#customer.first_name}, :#{#customer.last_name}, :#{#customer.email}, :#{#customer.phone_number})", nativeQuery = true)
    void saveCustomer(@Param("customer")Customer customer);

    @Modifying
    @Query(value = "UPDATE customer SET first_name=:#{#customer.first_name}, last_name=:#{#customer.last_name}, email=:#{#customer.email}, phone_number=:#{#customer.phone_number} WHERE customer_id=:#{#customer.customer_id}", nativeQuery = true)
    void updateCustomer(@Param("customer")Customer customer);

    @Modifying
    @Query(value = "DELETE FROM customer WHERE customer_id=:id", nativeQuery = true)
    void deleteCustomer(@Param("id")String customer_id);

    @Query(value = "SELECT * FROM customer", nativeQuery = true)
    List<Customer> getAllCustomers();
}
