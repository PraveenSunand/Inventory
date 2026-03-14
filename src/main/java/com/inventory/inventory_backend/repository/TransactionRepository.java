package com.inventory.inventory_backend.repository;

import com.inventory.inventory_backend.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction,String> {
}
