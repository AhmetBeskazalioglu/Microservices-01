package com.anke.SpringBoot_Microservices_01_Product.service;

import com.anke.SpringBoot_Microservices_01_Product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {

    private IProductRepository iProductRepository;

    @Autowired
    public ProductServiceImpl(IProductRepository iProductRepository){
        this.iProductRepository = iProductRepository;
    }
}
