package com.jaicol.shop.repository;

import com.jaicol.shop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Métodos personalizados si son necesarios
}
