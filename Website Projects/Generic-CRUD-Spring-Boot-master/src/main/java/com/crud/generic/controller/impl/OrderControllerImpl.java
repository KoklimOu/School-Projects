package com.crud.generic.controller.impl;

import com.crud.generic.Dto.ResponseDto;
import com.crud.generic.controller.OrderController;
import com.crud.generic.controller.generic.impl.ControllerGenericImpl;
import com.crud.generic.entity.Order;
import com.crud.generic.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/order")
public class OrderControllerImpl extends ControllerGenericImpl<Order> implements OrderController {

    private final OrderService orderService;

    public OrderControllerImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    @GetMapping("/find-by-customer-id/{id}")
    public ResponseDto findAllByCustomerId(@PathVariable Long id) {
        return this.orderService.findAllByCustomerId(id);
    }
}
