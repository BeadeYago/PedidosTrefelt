package com.pedidos.trefelt.service;

import com.pedidos.trefelt.dto.OrderDto;
import com.pedidos.trefelt.dto.OrderItemDto;
import com.pedidos.trefelt.entity.*;
import com.pedidos.trefelt.repository.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    public OrderService(OrderRepository orderRepo, MaterialRepository materialRepo, GapRepository gapRepo, LeaderRepository leaderRepo, StationRepository stationRepo){
        this.orderRepo = orderRepo;
        this.materialRepo = materialRepo;
        this.gapRepo = gapRepo;
        this.leaderRepo = leaderRepo;
        this.stationRepo = stationRepo;
    }

    private OrderRepository orderRepo;
    private MaterialRepository materialRepo;
    private GapRepository gapRepo;
    private LeaderRepository leaderRepo;
    private StationRepository stationRepo;

    public Order save(OrderDto request){

        Order order = new Order();

        Gap gap = gapRepo.findById(request.getGapId())
                .orElseThrow();

        Leader leader = leaderRepo.findById(request.getLeaderId())
                .orElseThrow();

        Station station = stationRepo.findById(request.getStationId())
                .orElseThrow();

        order.setDate(LocalDateTime.now());
        order.setGap(gap);
        order.setLeader(leader);
        order.setStation(station);
        order.setPriority(request.getPriority());

        List<OrderItem> orderItemsList = new ArrayList<>();

        for (OrderItemDto requestItem : request.getItems()) {

            Material material =
                    materialRepo.findByCode(
                            requestItem.getCode()
                    );

            OrderItem item = new OrderItem();

            item.setMaterial(material);

            item.setQuantity(requestItem.getQuantity());

            item.setOrder(order);

            orderItemsList.add(item);
        }

        order.setItems(orderItemsList);

        return orderRepo.save(order);
    }

    public List<Order> findAll(){
        return orderRepo.findAll();
    }

}
