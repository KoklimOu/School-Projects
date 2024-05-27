package com.crud.generic.service;

import com.crud.generic.entity.Customer;
import com.crud.generic.service.generic.ServiceGeneric;

import java.util.List;
import java.util.Map;

public interface CustomerService extends ServiceGeneric<Customer>{

    Long login(Map<String, Object> params);

    Long login1(String username, String password);

}
