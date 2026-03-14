package com.inventory.inventory_backend.model;



import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;

    private String laptopId;

    private String  employeeId;

    private LocalDate issueDate;

    private LocalDate returnDate;

    private String status;

}
