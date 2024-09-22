// src/main/java/com/jaicol/shop/repository/ProductRepository.java
package com.jaicol.shop.repository;

import com.jaicol.shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Métodos personalizados si son necesarios
}
