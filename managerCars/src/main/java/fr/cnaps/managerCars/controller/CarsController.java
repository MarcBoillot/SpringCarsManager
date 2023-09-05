package fr.cnaps.managerCars.controller;
import fr.cnaps.managerCars.model.Car;
import fr.cnaps.managerCars.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class CarsController implements CommandLineRunner {
        public static void main(String[] args) {
            SpringApplication.run(CarsController.class, args);
        }

        @Override
        public void run(String... args) throws Exception {
                Car allcars = cs.getAllCars();
                System.out.println(allcars);
        }

        @Autowired
        private CarsService cs;

        @GetMapping("/cars")
        public String AllCars(@RequestParam()int id, String brand, String modele, String color) {
                return String.format( id, brand , modele, color);
        }
        @GetMapping("/cars/{id}")
        public String CarsById(@RequestParam()int id){
                return String.format(id);
        }
}
