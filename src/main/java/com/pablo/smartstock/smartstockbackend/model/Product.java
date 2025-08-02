package com.pablo.smartstock.smartstockbackend.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private UUID id;

    private String nombre;
    private String descripcion;
    private String categoria;
    private Double precio;
    private Integer stockActual;
    private Integer stockMinimo;
    private LocalDate fechaUltimaCompra;

}
