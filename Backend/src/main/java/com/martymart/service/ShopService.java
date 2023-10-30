package com.martymart.service;

import com.martymart.dto.CategoryDTO;
import com.martymart.dto.ProductDTO;
import com.martymart.dto.SubcategoryDTO;
import java.util.List;

public interface ShopService {
    String getNextProductID();

    List<ProductDTO> getAllProducts();

    List<CategoryDTO> getAllCategories();

    List<ProductDTO> getAllProductsByCategory(String category_id);

    List<SubcategoryDTO> getAllSubcategoriesByCategory(String category_id);

    List<ProductDTO> getAllProductsBySubcategory(String subcategory_id);
}
