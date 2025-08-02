package com.pablo.smartstock.smartstockbackend.repository;

import com.pablo.smartstock.smartstockbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
