package com.pedidos.trefelt.controller;

import com.pedidos.trefelt.entity.Leader;
import com.pedidos.trefelt.service.LeaderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leader")
public class LeaderController {

    public LeaderController(LeaderService service){
        this.service = service;
    }

    private LeaderService service;

    @PostMapping
    public Leader save(@RequestBody Leader leader){
        return service.save(leader);
    }

}
