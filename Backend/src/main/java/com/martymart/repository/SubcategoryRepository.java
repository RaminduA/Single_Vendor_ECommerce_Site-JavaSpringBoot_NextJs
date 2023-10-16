package com.martymart.repository;

import com.martymart.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubcategoryRepository extends JpaRepository<Subcategory, String> {
    @Query(value = "SELECT * FROM subcategory WHERE subcategory_id=:id", nativeQuery = true)
    Subcategory getSubcategory(@Param("id")String subcategory_id);

    @Query(value = "Insert into subcategory values (:#{#subcategory.subcategory_id}, :#{#subcategory.subcategory_name}, :#{#subcategory.parent_category_id})", nativeQuery = true)
    void saveSubcategory(@Param("subcategory")Subcategory subcategory);

    @Query(value = "UPDATE subcategory SET subcategory_name=:#{#subcategory.subcategory_name}, parent_category_id=:#{#subcategory.parent_category_id} WHERE subcategory_id=:#{#subcategory.subcategory_id}", nativeQuery = true)
    void updateSubcategory(@Param("subcategory")Subcategory subcategory);

    @Query(value = "DELETE FROM subcategory WHERE subcategory_id=:id", nativeQuery = true)
    void deleteSubcategory(@Param("id")String subcategory_id);

    @Query(value = "SELECT * FROM subcategory WHERE parent_category_id=:id", nativeQuery = true)
    List<Subcategory> getAllByParentCategory(@Param("id")String parent_category_id);

}
