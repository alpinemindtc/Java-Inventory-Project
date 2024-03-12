package com.example.demo.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.CarModel;
public interface VehicleModelRepo extends JpaRepository<CarModel, Long> {
}
