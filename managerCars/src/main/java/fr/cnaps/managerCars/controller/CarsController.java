package fr.cnaps.managerCars.controller;
import fr.cnaps.managerCars.model.Car;
import fr.cnaps.managerCars.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * le controller recupere ce qui se situe dans le service
 */
@SpringBootApplication
@RestController
public class CarsController{
        public static void main(String[] args) {
            SpringApplication.run(CarsController.class, args);
        }

        /**
         * je recup le service grace a linstaciation autowired
         */
        @Autowired
        private CarsService cs;

        /**
         * je montre le chemin url pour afficher le retour des methodes
         * @return
         */
        @GetMapping("/cars")
        public List<Car> AllCars() {
                return cs.getAllCars();

        }
        @GetMapping("/cars/{id}")
        public Car CarsById(@PathVariable int id){
                return cs.getCarById(id);
        }
        @PostMapping("cars/create")
        public List<Car> createCar(@RequestBody Car car) {
                return cs.createCar(car);
        }

//        @PutMapping("/modify/{id}")
//        public Car modifyCar(@PathVariable int id, @RequestParam Car car) {
//                return cs.modifyCar(car,id);
//        }

        @DeleteMapping("cars/delete/{id}")
        public Car deleteCar(@PathVariable int id) {
              return cs.deleteCar(id);
        }

}
