package com.martymart.service.impl;

import com.martymart.service.AnalyticsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AnalyticsServiceImpl implements AnalyticsService {
    @Override
    public String getQuarterlySalesWithinLastYear() {
        return null;
    }

    @Override
    public String getProductsWithMostSales() {
        return null;
    }

    @Override
    public String getCategoryWithMostOrders() {
        return null;
    }

    @Override
    public String getCustomerOrderReport() {
        return null;
    }
}
