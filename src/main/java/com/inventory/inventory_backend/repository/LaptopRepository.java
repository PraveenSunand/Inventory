package com.inventory.inventory_backend.repository;

import com.inventory.inventory_backend.model.Laptop;
import  org.springframework.data.mongodb.repository.MongoRepository;


public interface LaptopRepository extends MongoRepository<Laptop,String> {
}
