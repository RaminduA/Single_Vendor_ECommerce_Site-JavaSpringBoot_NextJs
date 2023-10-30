package com.martymart.controller;

import com.martymart.dto.CategoryDTO;
import com.martymart.dto.ProductDTO;
import com.martymart.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/analytics")
public class AnalyticsController {
    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping("/quarterly-sales")
    public String getQuarterlySalesWithinLastYear() {
        return "Quarterly Sales";
    }

    @GetMapping("/products-with-most-sales")
    public List<ProductDTO> getProductsWithMostSales() {
        return null;
    }

    @GetMapping("/category-with-most-orders")
    public CategoryDTO getCategoryWithMostOrders() {
        return null;
    }

    @GetMapping("/customer-order-report")
    public String getCustomerOrderReport() {
        return "Customer Order Report";
    }


}
