package com.pedidos.trefelt.controller;

import com.pedidos.trefelt.entity.Material;
import com.pedidos.trefelt.service.MaterialService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/material")
public class MaterialController {

    public MaterialController(MaterialService service){
        this.service = service;
    }

    private MaterialService service;

    @PostMapping
    public Material save(@RequestBody Material material){
        return service.save(material);
    }

}
