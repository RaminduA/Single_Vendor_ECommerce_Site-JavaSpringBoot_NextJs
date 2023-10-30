package com.martymart.service;

import com.martymart.dto.ProductDTO;

public interface ProductService {
    ProductDTO getProduct(String product_id);
}
