package com.winestudo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winestudo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
