package com.greenfox.retake.exam.repository;

import com.greenfox.retake.exam.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findDistinctByNameContains(String name);
    List<Product> findDistinctBySizeContains(String size);
}
