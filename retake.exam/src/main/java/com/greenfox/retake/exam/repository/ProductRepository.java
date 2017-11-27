package com.greenfox.retake.exam.repository;

import com.greenfox.retake.exam.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
