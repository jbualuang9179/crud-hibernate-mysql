package com.jirapong.crudhibernatemysql.repository;

import com.jirapong.crudhibernatemysql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
