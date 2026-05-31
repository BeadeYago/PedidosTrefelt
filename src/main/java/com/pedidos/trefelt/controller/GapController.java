package com.pedidos.trefelt.controller;

import com.pedidos.trefelt.entity.Gap;
import com.pedidos.trefelt.service.GapService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gap")
public class GapController {

    public GapController(GapService service){
        this.service = service;
    }

    private GapService service;

    @PostMapping
    public Gap save(@RequestBody Gap gap){
        return service.save(gap);
    }

    @GetMapping("/{id}")
    public Gap findById(@PathVariable Integer id){
        return service.findById(id);
    }

}
