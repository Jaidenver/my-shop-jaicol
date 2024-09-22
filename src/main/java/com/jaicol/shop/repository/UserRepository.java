// src/main/java/com/jaicol/shop/repository/UserRepository.java
package com.jaicol.shop.repository;

import com.jaicol.shop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
