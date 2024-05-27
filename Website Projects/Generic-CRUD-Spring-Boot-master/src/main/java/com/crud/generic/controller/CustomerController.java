package com.crud.generic.controller;

import com.crud.generic.controller.generic.ControllerGeneric;
import com.crud.generic.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

public interface CustomerController extends ControllerGeneric<Customer> {

    Long login1(@RequestBody Map<String, Object> params);
    ResponseEntity<?> login(@RequestBody Map<String, Object> params);
    Long login2(@RequestParam String username, @RequestParam String password);

}
