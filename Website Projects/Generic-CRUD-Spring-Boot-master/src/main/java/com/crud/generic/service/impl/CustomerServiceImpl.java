package com.crud.generic.service.impl;

import com.crud.generic.entity.baseEntity.BaseEntity;
import com.crud.generic.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.generic.entity.Customer;
import com.crud.generic.service.CustomerService;
import com.crud.generic.service.generic.impl.ServiceGenericImpl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class CustomerServiceImpl extends ServiceGenericImpl<Customer> implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Long login(Map<String, Object> params) {
        String username = params.get("username").toString();
        String password = params.get("password").toString();
        Optional<Customer> customer = customerRepository.findByUserNameAndPassword(username, password);
        return customer.map(BaseEntity::getId).orElse(null);
    }

    @Override
    public Long login1(String username, String password) {
        Optional<Customer> customer = customerRepository.findByUserNameAndPassword(username, password);
        return customer.map(BaseEntity::getId).orElse(null);
    }
}
