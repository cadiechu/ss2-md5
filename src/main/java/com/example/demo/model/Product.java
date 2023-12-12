package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    @Id
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private double price;
    @Column
    private String description;
    @Column
    private String image;
}
