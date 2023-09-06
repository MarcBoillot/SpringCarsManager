package fr.cnaps.managerCars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Car {
    @Id
    private int id;
    @Column(name = "brand")
    private String brand;
    @Column
    private String model;
    @Column
    private String color;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
        this.id = 1;
    }
    public Car (int id,String brand,String model,String color){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

}
