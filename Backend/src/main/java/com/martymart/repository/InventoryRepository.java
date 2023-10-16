package com.martymart.repository;

import com.martymart.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, String> {
    @Query(value = "SELECT * FROM inventory WHERE inventory_id=:id LIMIT 1", nativeQuery = true)
    Inventory getInventory(@Param("id")String inventory_id);

    @Query(value = "INSERT INTO inventory VALUES (:#{#inventory.inventory_id}, :#{#inventory.product_id}, :#{#inventory.inventory_quantity}, :#{#inventory.inventory_price})", nativeQuery = true)
    void saveInventory(@Param("inventory")Inventory inventory);

    @Query(value = "UPDATE inventory SET product_id=:#{#inventory.product_id}, inventory_quantity=:#{#inventory.inventory_quantity}, inventory_price=:#{#inventory.inventory_price} WHERE inventory_id=:#{#inventory.inventory_id}", nativeQuery = true)
    void updateInventory(@Param("inventory")Inventory inventory);

    @Query(value = "DELETE FROM inventory WHERE inventory_id=:id", nativeQuery = true)
    void deleteInventory(@Param("id")String inventory_id);

    @Query(value = "SELECT * FROM inventory", nativeQuery = true)
    List<Inventory> getAllInventories();
}