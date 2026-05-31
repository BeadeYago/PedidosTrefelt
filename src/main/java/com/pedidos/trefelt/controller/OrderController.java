package com.pedidos.trefelt.controller;

import com.pedidos.trefelt.dto.OrderDto;
import com.pedidos.trefelt.entity.Order;
import com.pedidos.trefelt.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/order")
public class OrderController {

    public OrderController(OrderService service){
        this.service = service;
    }

    private OrderService service;

    @PostMapping
    public Order save(@RequestBody OrderDto order){
        return service.save(order);
    }

    @GetMapping
    public List<Order> findAll(){
        return service.findAll();
    }
}
