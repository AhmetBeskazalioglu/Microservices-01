package com.anke.SpringBoot_Microservices_01_Product.repository;

import com.anke.SpringBoot_Microservices_01_Product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
