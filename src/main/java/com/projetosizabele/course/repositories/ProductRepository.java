package com.projetosizabele.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetosizabele.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
