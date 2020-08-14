package com.thoughtworks.rslist.api;

import com.thoughtworks.rslist.domain.Product;
import com.thoughtworks.rslist.dto.ProductDto;
import com.thoughtworks.rslist.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/api/products")
    ResponseEntity<List<Product>> getProductList() {

        List<Product> products = productRepository.findAll().stream().map(item->
                Product.builder()
                .name(item.getName())
                .price(item.getPrice())
                .unit(item.getUnit())
                .build())
        .collect(Collectors.toList());
        return ResponseEntity.ok(products);
    }
}
