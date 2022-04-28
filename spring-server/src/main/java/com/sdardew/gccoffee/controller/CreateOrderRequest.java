package com.sdardew.gccoffee.controller;

import com.sdardew.gccoffee.model.OrderItem;

import java.util.List;

public record CreateOrderRequest(
  String email, String address, String postcode, List<OrderItem> orderItems
) {
}
