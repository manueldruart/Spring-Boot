package be.technocite.ecarfinal.userapi.dto;

import be.technocite.ecarfinal.car.modele.Car;
import be.technocite.ecarfinal.user.modele.UserDto;

import java.util.List;

public class UserBuyerDto extends UserDto {
    public UserBuyerDto(int id, String firstName, List<Car> favoriteCars) {
        super();
    }
}
