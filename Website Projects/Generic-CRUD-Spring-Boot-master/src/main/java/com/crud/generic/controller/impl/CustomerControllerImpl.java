package com.crud.generic.controller.impl;

import com.crud.generic.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.crud.generic.controller.CustomerController;
import com.crud.generic.controller.generic.impl.ControllerGenericImpl;
import com.crud.generic.entity.Customer;

import java.util.Map;

@RestController
@RequestMapping(path = "/customer")
public class CustomerControllerImpl extends ControllerGenericImpl<Customer> implements CustomerController {

    private final CustomerService customerService;

    public CustomerControllerImpl(CustomerService customerService) {
        this.customerService = customerService;
    }


    @Override
    @PostMapping("/login1")
    public Long login1(@RequestBody Map<String, Object> params) {
        return this.customerService.login(params);
    }

    @Override
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody Map<String, Object> params) {
        return new ResponseEntity<>(customerService.login(params), HttpStatus.OK);
    }

    @Override
    @PostMapping("/login2")
    public Long login2(@RequestParam String username,@RequestParam String password) {
        return this.customerService.login1(username, password);
    }
}
