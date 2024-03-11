package com.example.demo.models;


import jakarta.persistence.*;

@Entity
@Table(name = "inventory")
public class InventoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "model_id", nullable = false)
    private CarModel carModel;

    private String vin;
    private String location;

      // getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public CarModel getCarModel() {
        return carModel;
    }
    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }
    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

      //constructors
    public InventoryItem(Long id, CarModel carModel, String vin, String location) {
        this.id = id;
        this.carModel = carModel;
        this.vin = vin;
        this.location = location;
    }
    public InventoryItem(){
    }
}
