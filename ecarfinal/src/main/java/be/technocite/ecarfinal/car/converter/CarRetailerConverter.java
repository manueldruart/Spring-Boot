package be.technocite.ecarfinal.car.converter;

import be.technocite.ecarfinal.car.modele.Car;
import be.technocite.ecarfinal.carapi.dto.CarDtoRetailer;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CarRetailerConverter implements Function<Car, CarDtoRetailer> {

    @Override
    public CarDtoRetailer apply(Car car) {
        return new CarDtoRetailer(
                car.getId(),
                car.getBrand(),
                car.getBuyingPrice(),
                car.getMarketPrice(),
                car.getVin(),
                car.getYear()
        );
    }
}

