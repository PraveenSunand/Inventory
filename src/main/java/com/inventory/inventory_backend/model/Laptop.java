package com.inventory.inventory_backend.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "laptops")
public class Laptop {
    @Id
    private String id;

    private String brand;

    private String model;

    private String serialNumber;

    private String status;



}
