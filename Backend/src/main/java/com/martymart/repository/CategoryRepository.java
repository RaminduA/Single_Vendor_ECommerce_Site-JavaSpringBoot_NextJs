package com.martymart.repository;

import com.martymart.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, String>{
    @Query(value = "SELECT category_id FROM category ORDER BY category_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM category WHERE category_id=:id LIMIT 1", nativeQuery = true)
    Category getCategory(@Param("id")String category_id);

    @Modifying
    @Query(value = "INSERT INTO category (category_id, category_name) VALUES (:#{#category.category_id}, :#{#category.category_name})", nativeQuery = true)
    void saveCategory(@Param("category")Category category);

    @Modifying
    @Query(value = "UPDATE category SET category_name=:#{#category.category_name} WHERE category_id=:#{#category.category_id}", nativeQuery = true)
    void updateCategory(@Param("category")Category category);

    @Modifying
    @Query(value = "DELETE FROM category WHERE category_id=:id", nativeQuery = true)
    void deleteCategory(@Param("id")String category_id);

    @Query(value = "SELECT * FROM category", nativeQuery = true)
    List<Category> getAllCategories();

    @Query(value = "SELECT COUNT(*)>0 FROM category WHERE category_id=:id", nativeQuery = true)
    Boolean isCategoryExists(@Param("id")String category_id);
}