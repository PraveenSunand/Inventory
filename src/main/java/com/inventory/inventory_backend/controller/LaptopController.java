package com.inventory.inventory_backend.controller;

import com.inventory.inventory_backend.model.Laptop;
import com.inventory.inventory_backend.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 Controller handles HTTP requests.
*/

@RestController
@RequestMapping("/api/laptops")
@CrossOrigin  // Allows React frontend to access APIs
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    // API to add laptop
    @PostMapping
    public Laptop addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }

    // API to get all laptops
    @GetMapping
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
    }

    // API to get laptop by id
    @GetMapping("/{id}")
    public Laptop getLaptop(@PathVariable String id){
        return laptopService.getLaptopById(id);
    }

    // API to delete laptop
    @DeleteMapping("/{id}")
    public void deleteLaptop(@PathVariable String id){
        laptopService.deleteLaptop(id);
    }
}