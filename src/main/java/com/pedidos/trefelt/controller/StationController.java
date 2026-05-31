package com.pedidos.trefelt.controller;

import com.pedidos.trefelt.dto.StationDto;
import com.pedidos.trefelt.entity.Station;
import com.pedidos.trefelt.repository.StationRepository;
import com.pedidos.trefelt.service.StationService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/station")
@RestController
public class StationController {

    public StationController(StationService service){
        this.service = service;
    }

    private StationService service;

    @PostMapping
    public Station save(@RequestBody StationDto station){
        return service.save(station);
    }

    @GetMapping("/{id}")
    public Station findById(@PathVariable Integer id){
        return service.findById(id);
    }

}
