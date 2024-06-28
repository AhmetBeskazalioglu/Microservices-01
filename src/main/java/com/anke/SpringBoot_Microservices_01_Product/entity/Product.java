package com.anke.SpringBoot_Microservices_01_Product.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data // Lombok annotation to generate getters and setters
@Entity // JPA annotation to make this class as an entity
@Table(name="product") // JPA annotation to map this class to a table
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length = 100,nullable = false)
    private String name;

    @Column(name="price",nullable = false)
    private double price;

    @Column(name="create_time",nullable = false)
    private LocalDateTime createTime;
}
