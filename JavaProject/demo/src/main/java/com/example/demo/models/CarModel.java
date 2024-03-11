package com.example.demo.models;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "Model")
public class CarModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_id")
    private Long id;

    private String make;
    private String model;
    @Column(name = "Car Year")
    private int year;
    private String color;

    // getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //constructors

    public CarModel(Long id, String make, String model, int year, String color) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public CarModel(){
}
}
