package be.technocite.ecarfinal.user.converter;

import be.technocite.ecarfinal.user.modele.UserDto;
import be.technocite.ecarfinal.userapi.dto.UserBuyerDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UserBuyerConverter implements Function<UserDto, UserBuyerDto> {
    @Override
    public UserBuyerDto apply(UserDto userDto) {
        return new UserBuyerDto(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getFavoriteCars()
        );
    }
}
