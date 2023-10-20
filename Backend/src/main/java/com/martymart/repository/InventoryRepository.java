package com.martymart.repository;

import com.martymart.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, String> {
    @Query(value = "SELECT inventory_id FROM inventory ORDER BY inventory_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM inventory WHERE inventory_id=:id LIMIT 1", nativeQuery = true)
    Inventory getInventory(@Param("id")String inventory_id);

    @Modifying
    @Query(value = "INSERT INTO inventory (inventory_id, product_id, warehouse_id, count) VALUES (:#{#inventory.inventory_id}, :#{#inventory.product_id}, :#{#inventory.warehouse_id}, :#{#inventory.count})", nativeQuery = true)
    void saveInventory(@Param("inventory")Inventory inventory);

    @Modifying
    @Query(value = "UPDATE inventory SET product_id=:#{#inventory.product_id}, warehouse_id=:#{#inventory.warehouse_id}, count=:#{#inventory.count} WHERE inventory_id=:#{#inventory.inventory_id}", nativeQuery = true)
    void updateInventory(@Param("inventory")Inventory inventory);

    @Modifying
    @Query(value = "DELETE FROM inventory WHERE inventory_id=:id", nativeQuery = true)
    void deleteInventory(@Param("id")String inventory_id);

    @Query(value = "SELECT * FROM inventory", nativeQuery = true)
    List<Inventory> getAllInventories();
}