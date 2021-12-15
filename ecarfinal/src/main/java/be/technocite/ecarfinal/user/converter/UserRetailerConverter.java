package be.technocite.ecarfinal.user.converter;

import be.technocite.ecarfinal.user.modele.UserDto;
import be.technocite.ecarfinal.userapi.dto.UserRetailerDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UserRetailerConverter implements Function<UserDto, UserRetailerDto> {

    @Override
    public UserRetailerDto apply(UserDto userDto) {
        return new UserRetailerDto(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getFavoriteCars()
        );
    }
}
