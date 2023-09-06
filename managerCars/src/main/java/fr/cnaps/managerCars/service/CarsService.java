package fr.cnaps.managerCars.service;

import fr.cnaps.managerCars.model.Car;
import fr.cnaps.managerCars.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsService {
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
//    public getCarsById(){
//
//    }
}
