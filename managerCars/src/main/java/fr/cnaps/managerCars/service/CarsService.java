package fr.cnaps.managerCars.service;

import fr.cnaps.managerCars.model.Car;
import fr.cnaps.managerCars.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * service est l'intelligence du programme permet de mettre en lien les differentes methodes
 * c'est aussi un bean avec bean
 */
@Service
public class CarsService {
    /**
     * autowired permet injecter l'instanciation pour que le repository soit lu
     */
    @Autowired
    CarsRepository cr;
    public List<Car> getAllCars(){
        return cr.AllCars();
    }

    public Car getCarById(int id){
        for (int i = 0; i < cr.cars.size(); i++) {
            Car car = cr.cars.get(i);
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }
    public List<Car> createCar(Car car){
      cr.cars.add(car);
      return cr.cars;
    }
    public Car deleteCar(int id){
       return cr.deleteCar(id);
    }
//    public List<Car> modifyCar(Car car,id){
//        return cr.cars
//    }
}
