package com.alvi.springMvcHw3.repository.impl;

import com.alvi.springMvcHw3.model.dto.Product;
import com.alvi.springMvcHw3.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> productList;


    @PostConstruct
    public void init() {
        productList = new ArrayList<>(Arrays.asList(
                new Product(1L, "Яблоко", 30),
                new Product(2L, "Мандарин", 50),
                new Product(3L, "Малина", 20)
        ));
    }


    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public Product findById(Long id) {
        return productList.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Студент не найден"));
    }
}
