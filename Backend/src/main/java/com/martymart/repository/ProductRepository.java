package com.martymart.repository;

import com.martymart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    @Query(value = "SELECT product_id FROM product ORDER BY product_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM product WHERE product_id=:id LIMIT 1", nativeQuery = true)
    Product getProduct(@Param("id")String product_id);

    @Modifying
    @Query(value = "INSERT INTO product (product_id, parent_category_id, product_name, image, description, price) VALUES (:#{#product.product_id}, :#{#product.subcategory.subcategory_id}, :#{#product.product_name}, :#{#product.image}, :#{#product.description}, :#{#product.price})", nativeQuery = true)
    void saveProduct(@Param("product")Product product);

    @Modifying
    @Query(value = "UPDATE product SET parent_category_id=:#{#product.subcategory.subcategory_id}, product_name=:#{#product.product_name}, image=:#{#product.image}, description=:#{#product.description}, price=:#{#product.price} WHERE product_id=:#{#product.product_id}", nativeQuery = true)
    void updateProduct(@Param("product")Product product);

    @Modifying
    @Query(value = "DELETE FROM product WHERE product_id=:id", nativeQuery = true)
    void deleteProduct(@Param("id")String product_id);

    @Query(value = "SELECT * FROM product WHERE parent_category_id=:id", nativeQuery = true)
    List<Product> getAllProductsByParentCategory(@Param("id")String parent_category_id);

    @Query(value = "SELECT p.* FROM products p INNER JOIN subcategories s ON p.parent_category_id = s.subcategory_id INNER JOIN categories c ON s.parent_category_id = c.category_id WHERE c.category_id=:id", nativeQuery = true)
    List<Product> getAllProductsBySuperCategory(@Param("id")String super_category_id);

    @Query(value = "SELECT * FROM product", nativeQuery = true)
    List<Product> getAllProducts();
}
