package com.martymart.repository;

import com.martymart.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WarehouseRepository extends JpaRepository<Warehouse, String> {
    @Query(value = "SELECT warehouse_id FROM warehouse ORDER BY warehouse_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM warehouse WHERE warehouse_id=:id LIMIT 1", nativeQuery = true)
    Warehouse getWarehouse(@Param("id")String warehouse_id);

    @Modifying
    @Query(value = "INSERT INTO warehouse (warehouse_id, warehouse_name, warehouse_address) VALUES (:#{#warehouse.warehouse_id}, :#{#warehouse.warehouse_name}, :#{#warehouse.warehouse_address})", nativeQuery = true)
    void saveWarehouse(@Param("warehouse")Warehouse warehouse);

    @Modifying
    @Query(value = "UPDATE warehouse SET warehouse_name=:#{#warehouse.warehouse_name}, warehouse_address=:#{#warehouse.warehouse_address} WHERE warehouse_id=:#{#warehouse.warehouse_id}", nativeQuery = true)
    void updateWarehouse(@Param("warehouse")Warehouse warehouse);

    @Modifying
    @Query(value = "DELETE FROM warehouse WHERE warehouse_id=:id", nativeQuery = true)
    void deleteWarehouse(@Param("id")String warehouse_id);

    @Query(value = "SELECT * FROM warehouse", nativeQuery = true)
    List<Warehouse> getAllWarehouses();

    @Query(value = "SELECT COUNT(*)>0 FROM warehouse WHERE warehouse_id=:id", nativeQuery = true)
    Boolean isWarehouseExists(@Param("id")String warehouse_id);
}
