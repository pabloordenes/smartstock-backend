package com.pablo.smartstock.smartstockbackend.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String description;
    private String category;
    private Double price;
    private Integer currentStock;
    private Integer minStock;
    private LocalDate lastPurchaseDate;
}
