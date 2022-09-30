package com.alvi.springMvcHw3.repository;

import com.alvi.springMvcHw3.model.dto.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAll();

    Product findById(Long id);

}
