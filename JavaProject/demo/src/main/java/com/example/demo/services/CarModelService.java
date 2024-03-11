package com.example.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.CarModel;
import com.example.demo.repositiories.VehicleModelRepo;

import java.util.List;

@Service
public class CarModelService {

    @Autowired
    private final VehicleModelRepo vehicleModelRepo;

    public CarModelService(VehicleModelRepo vehicleModelRepo) {
        this.vehicleModelRepo = vehicleModelRepo;
    }

    public List<CarModel> getAllCarModels() {
        return vehicleModelRepo.findAll();
    }

    public CarModel getCarModelById(Long id) {
        return vehicleModelRepo.findById(id).orElse(null);
    }

    public CarModel saveCarModel(CarModel carModel) {
        return vehicleModelRepo.save(carModel);
    }

    public void deleteCarModel(Long id) {
        vehicleModelRepo.deleteById(id);
    }
}
