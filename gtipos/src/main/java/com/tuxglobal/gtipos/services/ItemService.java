package com.tuxglobal.gtipos.services;

import java.util.List;

import com.tuxglobal.gtipos.model.Item;
import com.tuxglobal.gtipos.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItem() {
        List<Item> items = itemRepository.findAll();
        return items;
    }

    public boolean createItem() {
        // save to category
        // categoryId
        // save to item 
        return true;
    }
    
}
