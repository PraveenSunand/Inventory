package com.inventory.inventory_backend.Service;

import com.inventory.inventory_backend.model.Laptop;
import com.inventory.inventory_backend.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

    public Laptop addLaptop(Laptop laptop){
        return laptopRepository.save(laptop);
    }
    public List<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }
    public Laptop getLaptopById(String id){
        return laptopRepository.findById(id).orElse(null);
    }
    public void deleteLaptop(String id){
        laptopRepository.deleteById(id);
    }

}
