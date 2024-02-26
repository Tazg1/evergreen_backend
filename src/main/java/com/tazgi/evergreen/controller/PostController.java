package com.tazgi.evergreen.controller;

import com.tazgi.evergreen.ItemRepository;
import com.tazgi.evergreen.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    ItemRepository repo;

    @GetMapping("/items")
    public List<Item> getAllItems(){
        return repo.findAll();
    }
}
