package com.thoughtworks.rslist.repository;

import com.thoughtworks.rslist.dto.ProductDto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductDto, Integer> {
    @Override
    List<ProductDto> findAll();
}
