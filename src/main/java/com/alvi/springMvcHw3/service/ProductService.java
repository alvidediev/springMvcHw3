package com.alvi.springMvcHw3.service;

import com.alvi.springMvcHw3.model.dto.Product;
import com.alvi.springMvcHw3.repository.impl.ProductRepositoryImpl;
import lombok.RequiredArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepositoryImpl productRepository;

    public Product getProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.getAll();
    }
}
