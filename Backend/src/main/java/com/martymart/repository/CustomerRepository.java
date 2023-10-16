package com.martymart.repository;

import com.martymart.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Query(value = "SELECT * FROM customer WHERE customer_id=:id LIMIT 1", nativeQuery = true)
    Customer getCustomer(String id);

    @Query(value = "INSERT INTO customer VALUES (:#{#customer.customer_id}, :#{#customer.customer_name}, :#{#customer.customer_email}, :#{#customer.customer_password}, :#{#customer.customer_address}, :#{#customer.customer_phone})", nativeQuery = true)
    void saveCustomer(@Param("customer")Customer customer);

    @Query(value = "UPDATE customer SET customer_name=:#{#customer.customer_name}, customer_email=:#{#customer.customer_email}, customer_password=:#{#customer.customer_password}, customer_address=:#{#customer.customer_address}, customer_phone=:#{#customer.customer_phone} WHERE customer_id=:#{#customer.customer_id}", nativeQuery = true)
    void updateCustomer(@Param("customer")Customer customer);

    @Query(value = "DELETE FROM customer WHERE customer_id=:id", nativeQuery = true)
    void deleteCustomer(@Param("id")String id);

    @Query(value = "SELECT * FROM customer", nativeQuery = true)
    List<Customer> getAllCustomers();
}
