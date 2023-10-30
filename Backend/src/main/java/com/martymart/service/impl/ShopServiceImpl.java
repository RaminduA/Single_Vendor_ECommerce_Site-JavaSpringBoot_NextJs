package com.martymart.service.impl;

import com.martymart.dto.CategoryDTO;
import com.martymart.dto.ProductDTO;
import com.martymart.dto.SubcategoryDTO;
import com.martymart.entity.Category;
import com.martymart.entity.Product;
import com.martymart.entity.Subcategory;
import com.martymart.repository.CategoryRepository;
import com.martymart.repository.ProductRepository;
import com.martymart.repository.SubcategoryRepository;
import com.martymart.service.ShopService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service
@Transactional
public class ShopServiceImpl implements ShopService {
    private final CategoryRepository categoryRepository;
    private final SubcategoryRepository subcategoryRepository;
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public ShopServiceImpl(CategoryRepository categoryRepository, SubcategoryRepository subcategoryRepository, ProductRepository productRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.subcategoryRepository = subcategoryRepository;
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    public String getNextProductID() {
        String lastId = productRepository.getLastId();

        if (lastId == null) {
            return "PRD-000001";
        }

        BigInteger numericPartAsInt = new BigInteger(lastId.substring(4)).add(BigInteger.ONE);

        if (numericPartAsInt.toString().length() > 6) {
            throw new RuntimeException("Product ID cannot exceed 6 digits");
        }

        String numericPart = String.valueOf(numericPartAsInt);

        while (numericPart.length() < 6) {
            numericPart = "0" + numericPart;
        }

        return "PRD-" + numericPart;
    }

    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.getAllProducts();
        return modelMapper.map(products, new TypeToken<List<ProductDTO>>(){}.getType());
    }

    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = categoryRepository.getAllCategories();
        return modelMapper.map(categories, new TypeToken<List<CategoryDTO>>(){}.getType());
    }

    public List<ProductDTO> getAllProductsByCategory(String category_id) {
        List<Product> products = productRepository.getAllProductsBySuperCategory(category_id);
        return modelMapper.map(products, new TypeToken<List<ProductDTO>>(){}.getType());
    }

    public List<SubcategoryDTO> getAllSubcategoriesByCategory(String category_id) {
        List<Subcategory> subcategories = subcategoryRepository.getAllSubcategoriesByParentCategory(category_id);
        return modelMapper.map(subcategories, new TypeToken<List<SubcategoryDTO>>(){}.getType());
    }

    public List<ProductDTO> getAllProductsBySubcategory(String subcategory_id) {
        List<Product> products = productRepository.getAllProductsByParentCategory(subcategory_id);
        return modelMapper.map(products, new TypeToken<List<ProductDTO>>(){}.getType());
    }
}
