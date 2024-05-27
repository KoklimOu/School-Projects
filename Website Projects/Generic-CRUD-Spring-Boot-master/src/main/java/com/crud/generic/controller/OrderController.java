package com.crud.generic.controller;

import com.crud.generic.Dto.ResponseDto;
import com.crud.generic.controller.generic.ControllerGeneric;
import com.crud.generic.entity.Order;
import org.springframework.web.bind.annotation.PathVariable;

public interface OrderController extends ControllerGeneric<Order> {
    ResponseDto findAllByCustomerId(@PathVariable Long customerId);
}
