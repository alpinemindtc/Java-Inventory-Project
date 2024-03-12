package com.example.demo.services;

import com.example.demo.models.InventoryItem;
import com.example.demo.repositiories.InventoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryRepo InventoryRepo;

    public InventoryService(InventoryRepo InventoryRepo) {
        this.InventoryRepo = InventoryRepo;
    }

    public List<InventoryItem> getAllInventoryItems() {
        return InventoryRepo.findAll();
    }

    public InventoryItem getInventoryItemById(Long id) {
        return InventoryRepo.findById(id).orElse(null);
    }

    public InventoryItem saveInventoryItem(InventoryItem inventoryItem) {
        return InventoryRepo.save(inventoryItem);
    }

    public void deleteInventoryItem(Long id) {
        InventoryRepo.deleteById(id);
    }
}