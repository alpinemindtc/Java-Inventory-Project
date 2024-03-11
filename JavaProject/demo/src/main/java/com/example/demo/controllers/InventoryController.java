package com.example.demo.controllers;

import com.example.demo.models.InventoryItem;
import com.example.demo.services.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<InventoryItem>> getAllInventoryItems() {
        List<InventoryItem> inventoryItems = inventoryService.getAllInventoryItems();
        return new ResponseEntity<>(inventoryItems, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventoryItem> getInventoryItemById(@PathVariable("id") Long id) {
        InventoryItem inventoryItem = inventoryService.getInventoryItemById(id);
        return new ResponseEntity<>(inventoryItem, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<InventoryItem> saveInventoryItem(@RequestBody InventoryItem inventoryItem) {
        InventoryItem newInventoryItem = inventoryService.saveInventoryItem(inventoryItem);
        return new ResponseEntity<>(newInventoryItem, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<InventoryItem> updateInventoryItem(@RequestBody InventoryItem inventoryItem) {
        InventoryItem updatedInventoryItem = inventoryService.saveInventoryItem(inventoryItem);
        return new ResponseEntity<>(updatedInventoryItem, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInventoryItem(@PathVariable("id") Long id) {
        inventoryService.deleteInventoryItem(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}