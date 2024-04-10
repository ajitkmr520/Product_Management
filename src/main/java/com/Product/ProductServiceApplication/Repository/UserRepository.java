package com.Product.ProductServiceApplication.Repository;

import com.Product.ProductServiceApplication.Entity.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserRegister, Long> {
}

