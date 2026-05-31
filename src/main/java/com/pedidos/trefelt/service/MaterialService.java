package com.pedidos.trefelt.service;

import com.pedidos.trefelt.entity.Material;
import com.pedidos.trefelt.repository.MaterialRepository;
import jakarta.persistence.EntityExistsException;
import org.springframework.stereotype.Service;

@Service
public class MaterialService {

    public MaterialService(MaterialRepository repo){
        this.repo = repo;
    }

    private MaterialRepository repo;

    public Material save(Material material){
        if(repo.existsByCode(material.getCode())){
            throw new EntityExistsException("Ya existe un material con ese codigo");
        } else{
            return repo.save(material);
        }
    }
}
