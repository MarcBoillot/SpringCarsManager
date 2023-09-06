package fr.cnaps.managerCars.repository;

import java.util.ArrayList;
import java.util.List;
import fr.cnaps.managerCars.model.Car;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarsRepository implements CommandLineRunner {
    public List<Car> cars;

    public CarsRepository(){
        this.cars = definyCars();
    }

    public List<Car> AllCars(){
       return cars;

    }
    public Car CarsById(int id){
        return cars.get(id);
    }
    @Override
    public void run(String... args) throws Exception {
        definyCars();
    }
//    public UpdateCars(){
//
//    }
    public List<Car> definyCars(){

        List<Car>cars = new ArrayList<>();

        cars.add(new Car(1,"toyota","Yaris","green"));
        cars.add(new Car(2,"Mercedes","CLA","grey"));
        cars.add(new Car(3,"BMW","M4 Competition","orange"));
        cars.add(new Car(4,"Audi","RS4","black"));
        cars.add(new Car(5,"toyota","Aurus","green"));
        cars.add(new Car(6,"Lamborgini","Urus","yellow"));
        cars.add(new Car(7,"Citroen","C3","white"));
        cars.add(new Car(8,"Peugeot","208","grey"));

        return cars;
    }

}
