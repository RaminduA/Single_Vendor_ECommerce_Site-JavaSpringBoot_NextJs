package com.martymart.controller;

import com.martymart.dto.ProductDTO;
import com.martymart.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{product_id}")
    public ProductDTO getProduct(@PathVariable String product_id) {
        return productService.getProduct(product_id);
    }
}
