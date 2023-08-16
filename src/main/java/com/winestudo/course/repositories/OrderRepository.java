package com.winestudo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winestudo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
