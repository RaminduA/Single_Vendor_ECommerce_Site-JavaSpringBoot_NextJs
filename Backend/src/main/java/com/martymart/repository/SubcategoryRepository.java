package com.martymart.repository;

import com.martymart.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubcategoryRepository extends JpaRepository<Subcategory, String> {
    @Query(value = "SELECT subcategory_id FROM subcategory ORDER BY subcategory_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM subcategory WHERE subcategory_id=:id", nativeQuery = true)
    Subcategory getSubcategory(@Param("id")String subcategory_id);

    @Modifying
    @Query(value = "INSERT INTO subcategory (subcategory_id, subcategory_name, parent_category_id) VALUES (:#{#subcategory.subcategory_id}, :#{#subcategory.subcategory_name}, :#{#subcategory.category.category_id})", nativeQuery = true)
    void saveSubcategory(@Param("subcategory")Subcategory subcategory);

    @Modifying
    @Query(value = "UPDATE subcategory SET subcategory_name=:#{#subcategory.subcategory_name}, parent_category_id=:#{#subcategory.category.category_id} WHERE subcategory_id=:#{#subcategory.subcategory_id}", nativeQuery = true)
    void updateSubcategory(@Param("subcategory")Subcategory subcategory);

    @Modifying
    @Query(value = "DELETE FROM subcategory WHERE subcategory_id=:id", nativeQuery = true)
    void deleteSubcategory(@Param("id")String subcategory_id);

    @Query(value = "SELECT * FROM subcategory WHERE parent_category_id=:id", nativeQuery = true)
    List<Subcategory> getAllSubcategoriesByParentCategory(@Param("id")String parent_category_id);
}
