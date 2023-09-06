package fr.cnaps.managerCars.model;
public class Car {
    private int id;
    private String brand;
    private String modele;
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

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
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
    public Car (int id,String brand,String modele,String color){
        this.id = id;
        this.brand = brand;
        this.modele = modele;
        this.color = color;
    }

}
