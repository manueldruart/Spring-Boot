package be.technocite.ecarfinal.car.converter;

import be.technocite.ecarfinal.car.modele.Car;
import be.technocite.ecarfinal.carapi.dto.CarDtoBuyer;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CarBuyerConverter implements Function<Car, CarDtoBuyer> {

    @Override
    public CarDtoBuyer apply(Car car) {
        return new CarDtoBuyer(
                car.getId(),
                car.getBrand(),
                car.getMarketPrice(),
                car.getVin(),
                car.getYear()
        );
    }
}
