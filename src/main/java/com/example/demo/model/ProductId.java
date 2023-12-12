package com.example.demo.model;

import jakarta.persistence.Column;

import java.io.Serializable;

public class ProductId implements Serializable {
    @Column(name = "productId")

    private Long productId;

}
