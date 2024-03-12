package com.example.demo.controllers;

import com.example.demo.models.CarModel;
import com.example.demo.services.CarModelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/models")
public class CarModelController {
@Autowired
    private final CarModelService carModelService;

    public CarModelController(CarModelService carModelService) {
        this.carModelService = carModelService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<CarModel>> getAllCarModels() {
        List<CarModel> carModels = carModelService.getAllCarModels();
        return new ResponseEntity<>(carModels, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarModel> getCarModelById(@PathVariable("id") Long id) {
        CarModel carModel = carModelService.getCarModelById(id);
        return new ResponseEntity<>(carModel, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CarModel> saveCarModel(@RequestBody CarModel carModel) {
        CarModel newCarModel = carModelService.saveCarModel(carModel);
        return new ResponseEntity<>(newCarModel, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CarModel> updateCarModel(@RequestBody CarModel carModel) {
        CarModel updatedCarModel = carModelService.saveCarModel(carModel);
        return new ResponseEntity<>(updatedCarModel, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCarModel(@PathVariable("id") Long id) {
        carModelService.deleteCarModel(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
