package be.technocite.ecarfinal.carapi.controller;

import be.technocite.ecarfinal.car.service.CarService;
import be.technocite.ecarfinal.carapi.dto.CarDtoBuyer;
import be.technocite.ecarfinal.carapi.dto.CarDtoRetailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "${spring.data.rest.base-path}/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<CarDtoBuyer> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<CarDtoBuyer> getCarById(@PathVariable int id) {

        CarDtoBuyer car = carService.getCarById(id);

        if (car != null) return ResponseEntity.ok().body(car);
        else return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<CarDtoBuyer> deleteCar(@PathVariable int id) {
        if (carService.delete(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping // etant donne qu'au final seul le marketPrice est modifiable,
    // il aurait preferable creer un autre dtp ui aurait eu qu'une seule propriete nommee marketPrice
    public ResponseEntity<CarDtoBuyer> updateCar(@RequestBody CarDtoBuyer car) {
        if (carService.updateCar(car) != null) {
            return ResponseEntity.accepted().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping
    public ResponseEntity<CarDtoBuyer> addCar(@RequestBody CarDtoRetailer carDto) {
        CarDtoRetailer car = carService.addCar(carDto);
        URI newLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(car.getId())
                .toUri();
        return ResponseEntity.created(newLocation).build();
    }
}
