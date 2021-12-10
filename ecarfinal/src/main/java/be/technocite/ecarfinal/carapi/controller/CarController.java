package be.technocite.ecarfinal.carapi.controller;

import be.technocite.ecarfinal.car.modele.Car;
import be.technocite.ecarfinal.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "${spring.data.rest.base-path}/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping(value = "{id}")
    public Car getCarById(@PathVariable int id) {
        return carService.getCarById(id);
    }
}
