package be.technocite.ecarfinal.car.service;

import be.technocite.ecarfinal.car.modele.Car;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class CarService {

    private ArrayList<Car> cars = new ArrayList<>();

    @PostConstruct
    private void onPostConstruct() {
        cars.add(new Car(
                "MERCEDES",
                14999.99,
                10000.00,
                "AB9",
                new Date()
        ));
        cars.add(new Car(
                "BMW",
                19999.99,
                15000.00,
                "AC9",
                new Date()
        ));
    }

    public List<Car> getAllCars() {
        return this.cars;
    }

    public Car getCarById( int id) {
       return this.cars.stream()
                .filter(car -> car.getId() == id)
                .findFirst()
                .get();
    }
}

