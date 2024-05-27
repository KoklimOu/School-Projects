package com.crud.generic.service.impl;

import com.crud.generic.Dto.ResponseDto;
import com.crud.generic.entity.Order;
import com.crud.generic.repository.CustomerRepository;
import com.crud.generic.repository.OrderRepository;
import com.crud.generic.repository.ProductRepository;
import com.crud.generic.service.OrderService;
import com.crud.generic.service.generic.impl.ServiceGenericImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl extends ServiceGenericImpl<Order> implements OrderService {

    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    public OrderServiceImpl(OrderRepository orderRepository, CustomerRepository customerRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    @Override
    public ResponseDto findAllByCustomerId(Long customerId) {

        List<Object> order = orderRepository.findProduct(customerId);
        if (order.isEmpty()){
            return new ResponseDto("failed", 0);
        }
        return new ResponseDto("successful", order);

    }
}
