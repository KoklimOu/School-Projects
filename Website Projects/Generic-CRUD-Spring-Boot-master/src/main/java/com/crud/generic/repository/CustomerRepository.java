package com.crud.generic.repository;

import org.springframework.stereotype.Repository;

import com.crud.generic.entity.Customer;
import com.crud.generic.repository.generic.GenericRepository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends GenericRepository<Customer>{

    Optional<Customer> findByUserNameAndPassword(String username, String password);

}
