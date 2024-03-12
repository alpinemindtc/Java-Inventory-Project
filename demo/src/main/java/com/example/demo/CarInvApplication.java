package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.CarModel;
import com.example.demo.models.InventoryItem;
import com.example.demo.repositiories.InventoryRepo;
import com.example.demo.repositiories.VehicleModelRepo;
import com.example.demo.services.CarModelService;

@SpringBootApplication
public class CarInvApplication implements CommandLineRunner{

	

	public static void main(String[] args) {
		SpringApplication.run(CarInvApplication.class, args);


}
@Autowired
private VehicleModelRepo repo;

@Autowired
private InventoryRepo repo2;

private CarModelService service;


public CarInvApplication(CarModelService service) {
	this.service = service;
}

@Override
public void run(String... args) throws Exception {
	CarModel firstCarModel = new CarModel(1L, "Toyota", "Camry", 2019, "rED");
	repo.save(firstCarModel);

	InventoryItem firstInventoryItem = new InventoryItem(123L, service.getCarModelById(1L), "545454PP5454", "Texas");
	repo2.save(firstInventoryItem);
}

}