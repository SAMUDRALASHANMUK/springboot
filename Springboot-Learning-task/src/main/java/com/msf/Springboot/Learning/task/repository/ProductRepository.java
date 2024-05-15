package com.msf.Springboot.Learning.task.repository;

import com.msf.Springboot.Learning.task.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
