package com.crud.generic.service;

import com.crud.generic.Dto.ResponseDto;
import com.crud.generic.entity.Order;
import com.crud.generic.service.generic.ServiceGeneric;

public interface OrderService extends ServiceGeneric<Order> {
    ResponseDto findAllByCustomerId(Long customerId);
}
