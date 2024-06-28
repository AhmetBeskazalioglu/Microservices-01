package com.anke.SpringBoot_Microservices_01_Product.service;

import com.anke.SpringBoot_Microservices_01_Product.entity.Product;

import java.util.List;

public interface IProductService {

    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
