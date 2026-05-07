package com.pedidos.trefelt.service;

import com.pedidos.trefelt.entity.Order;
import com.pedidos.trefelt.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public OrderService(OrderRepository repo){
        this.repo = repo;
    }

    private OrderRepository repo;

    public Order save(Order order){
        return repo.save(order);
    }
}
