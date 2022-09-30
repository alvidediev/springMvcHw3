package com.alvi.springMvcHw3.controller;

import com.alvi.springMvcHw3.model.dto.Product;
import com.alvi.springMvcHw3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alvi.springMvcHw3.util.ControllerUtilityClass.GET_ALL_PRODUCTS;
import static com.alvi.springMvcHw3.util.ControllerUtilityClass.GET_PRODUCT_BY_ID;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping(value = GET_PRODUCT_BY_ID)
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping(value = GET_ALL_PRODUCTS)
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
