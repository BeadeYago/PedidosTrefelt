package com.pedidos.trefelt.service;

import com.pedidos.trefelt.dto.MaterialAssignDto;
import com.pedidos.trefelt.entity.Gap;
import com.pedidos.trefelt.entity.Material;
import com.pedidos.trefelt.entity.Product;
import com.pedidos.trefelt.repository.MaterialRepository;
import com.pedidos.trefelt.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    public ProductService(ProductRepository repo, MaterialRepository materialRepository){
        this.repo = repo;
        this.materialRepository = materialRepository;
    }

    private ProductRepository repo;
    private MaterialRepository materialRepository;

    public Product save(Product product){
        return repo.save(product);
    }

    public Product addMaterials(Integer id, MaterialAssignDto request){
        Product product = repo.findById(id).orElseThrow();

        List<Material> materials = materialRepository.findByCodeIn(request.getMaterialCodes());

        product.setMaterials(materials);

        return repo.save(product);
    }

    public Product findById(Integer id) {
        return repo.findById(id).orElseThrow();
    }
}

