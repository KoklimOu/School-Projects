package com.tuxglobal.gtipos.repository;

import com.tuxglobal.gtipos.model.Item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String>{
    
}
