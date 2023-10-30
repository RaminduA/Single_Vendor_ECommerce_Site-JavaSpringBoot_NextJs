package com.martymart.service.impl;

import com.martymart.dto.ProductDTO;
import com.martymart.repository.ProductRepository;
import com.martymart.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ProductDTO getProduct(String product_id) {
        productRepository.getProduct(product_id);
        return modelMapper.map(productRepository.getProduct(product_id), ProductDTO.class);
    }
}
