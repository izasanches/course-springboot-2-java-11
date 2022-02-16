package com.projetosizabele.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosizabele.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
