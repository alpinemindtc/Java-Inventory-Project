package com.example.demo.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.InventoryItem;

//@Repository
public interface InventoryRepo extends JpaRepository<InventoryItem, Long> {
}
