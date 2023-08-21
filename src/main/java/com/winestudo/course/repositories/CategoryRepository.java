package com.winestudo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winestudo.course.entities.Category;
import com.winestudo.course.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
