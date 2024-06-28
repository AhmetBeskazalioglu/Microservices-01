package com.anke.SpringBoot_Microservices_01_Product.service;

import com.anke.SpringBoot_Microservices_01_Product.entity.Product;
import com.anke.SpringBoot_Microservices_01_Product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    private IProductRepository iProductRepository;

    @Autowired
    public ProductServiceImpl(IProductRepository iProductRepository){
        this.iProductRepository = iProductRepository;
    }

    @Override
    public Product saveProduct(Product product)
    {
        product.setCreateTime(LocalDateTime.now());
        return iProductRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId)
    {
        iProductRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts()
    {
        return iProductRepository.findAll();
    }
}
