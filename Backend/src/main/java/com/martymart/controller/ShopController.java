package com.martymart.controller;

import com.martymart.dto.CategoryDTO;
import com.martymart.dto.ProductDTO;
import com.martymart.dto.SubcategoryDTO;
import com.martymart.service.ShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/shop")
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/")
    public List<ProductDTO> getAllProducts() {
        return shopService.getAllProducts();
    }

    @GetMapping("/categories")
    public List<CategoryDTO> getAllCategories() {
        return shopService.getAllCategories();
    }

    @GetMapping("/{category_id}")
    public List<ProductDTO> getAllProductsByCategory(@PathVariable String category_id) {
        return shopService.getAllProductsByCategory(category_id);
    }

    @GetMapping("/{category_id}/subcategories")
    public List<SubcategoryDTO> getAllSubcategoriesByCategory(@PathVariable String category_id) {
        return shopService.getAllSubcategoriesByCategory(category_id);
    }

    @GetMapping("/{category_id}/{subcategory_id}")
    public List<ProductDTO> getAllProductsBySubcategory(@PathVariable String category_id, @PathVariable String subcategory_id) {
        return shopService.getAllProductsBySubcategory(subcategory_id);
    }
}
