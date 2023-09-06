package fr.cnaps.managerCars.controller;
import fr.cnaps.managerCars.model.Car;
import fr.cnaps.managerCars.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
public class CarsController{
        public static void main(String[] args) {
            SpringApplication.run(CarsController.class, args);
        }

        @Autowired
        private CarsService cs;

        @GetMapping("/cars")
        public List<Car> AllCars() {
                return cs.getAllCars();

        }
        @GetMapping("/cars/{id}")
        public Car CarsById(@PathVariable int id){
                return cs.getCarById(id);
        }
}
