package com.pedidos.trefelt.service;

import com.pedidos.trefelt.entity.Product;
import com.pedidos.trefelt.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public ProductService(ProductRepository repo){
        this.repo = repo;
    }

    private ProductRepository repo;

    public Product save(Product product){
        return repo.save(product);
    }
}
