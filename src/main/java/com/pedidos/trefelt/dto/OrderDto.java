package com.pedidos.trefelt.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDto {

    private Integer gapId;

    private Integer leaderId;

    private Integer stationId;

    private String priority;

    private List<OrderItemDto> items;
}
