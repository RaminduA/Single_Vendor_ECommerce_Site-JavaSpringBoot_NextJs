package com.martymart.repository;

import com.martymart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, String> {
    @Query(value = "SELECT * FROM product WHERE product_id=:id LIMIT 1", nativeQuery = true)
    Product getProduct(@Param("id")String product_id);

    @Query(value = "INSERT INTO product VALUES (:#{#product.product_id}, :#{#product.parent_category_id}, :#{#product.product_name}, :#{#product.image}, :#{#product.description}, :#{#product.price})", nativeQuery = true)
    void saveProduct(@Param("product")Product product);

    @Query(value = "UPDATE product SET parent_category_id=:#{#product.parent_category_id}, product_name=:#{#product.product_name}, image=:#{#product.image}, description=:#{#product.description}, price=:#{#product.price} WHERE product_id=:#{#product.product_id}", nativeQuery = true)
    void updateProduct(@Param("product")Product product);

    @Query(value = "DELETE FROM product WHERE product_id=:id", nativeQuery = true)
    void deleteProduct(@Param("id")String product_id);

    @Query(value = "SELECT * FROM product WHERE parent_category_id=:id", nativeQuery = true)
    Product[] getAllByParentCategory(@Param("id")String parent_category_id);
}
