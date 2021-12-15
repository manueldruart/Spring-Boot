package be.technocite.ecarfinal.car.service;

import be.technocite.ecarfinal.car.converter.CarBuyerConverter;
import be.technocite.ecarfinal.car.converter.CarRetailerConverter;
import be.technocite.ecarfinal.car.dao.ICarDao;
import be.technocite.ecarfinal.car.exception.CarConflictException;
import be.technocite.ecarfinal.car.modele.Car;
import be.technocite.ecarfinal.carapi.dto.CarDtoBuyer;
import be.technocite.ecarfinal.carapi.dto.CarDtoRetailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    @Autowired
    private ICarDao dao;

    @Autowired
    private CarBuyerConverter buyerConverter;

    @Autowired
    private CarRetailerConverter retailerConverter;

    public List<CarDtoBuyer> getAllCars() {
        return dao.findAll()
                .stream()
                .map(buyerConverter)
                .collect(Collectors.toList());
    }

    public CarDtoBuyer getCarById(int id) {
        return buyerConverter.apply(dao.findById(id));
    }

    public boolean delete(int id) {
        return dao.delete(id);
    }

    public CarDtoBuyer updateCar(CarDtoBuyer carDto) {
        Car car = dao.findById(carDto.getId());

        if (car != null) {
            car.setMarketPrice(carDto.getMarketPrice());
            return buyerConverter.apply(dao.save(car));
        } else {
            return null;
        }
    }

    public CarDtoRetailer addCar(CarDtoRetailer carDto) {
        Car car = dao.findById(carDto.getId());

        if (car != null) {
            throw new CarConflictException(car.getId());
        } else {
            Car entiteDb = dao.save(new Car(
                    carDto.getBrand(),
                    carDto.getBuyingPrice(),
                    carDto.getMarketPrice(),
                    carDto.getVin(),
                    carDto.getYear()
            ));
            return retailerConverter.apply(entiteDb);
        }
    }
}


