package com.pedidos.trefelt.controller;

import com.pedidos.trefelt.dto.MaterialAssignDto;
import com.pedidos.trefelt.entity.Product;
import com.pedidos.trefelt.repository.MaterialRepository;
import com.pedidos.trefelt.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    public ProductController(ProductService service, MaterialRepository materialRepository){
        this.service = service;
    }

    private ProductService service;

    @PostMapping
    public Product save(@RequestBody Product product){
        return service.save(product);
    }


    @PutMapping("/{id}")
    public Product addMaterials(@PathVariable Integer id, @RequestBody MaterialAssignDto request){
        return service.addMaterials(id, request);
    }
}
