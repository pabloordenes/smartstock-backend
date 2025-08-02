package com.pablo.smartstock.smartstockbackend.service;

import com.pablo.smartstock.smartstockbackend.model.Product;
import com.pablo.smartstock.smartstockbackend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
