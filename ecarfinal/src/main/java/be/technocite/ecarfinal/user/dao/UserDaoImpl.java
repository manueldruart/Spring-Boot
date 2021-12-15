package be.technocite.ecarfinal.user.dao;

import be.technocite.ecarfinal.user.modele.UserDto;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao {

    private List<UserDto> userDtos = new ArrayList<>();

    @PostConstruct
    private void onPostConstruct() {
        userDtos.add(new UserDto(
                1,
                "Manu",
                new ArrayList<>()

        ));
        userDtos.add(new UserDto(
                2,
                "Lucas",
                new ArrayList<>()
        ));
    }


    @Override
    public UserDto findById(int id) {
        return userDtos.stream()
                .filter(userDto -> userDto.getId() == id)
                .findFirst()
                .orElse(null)

    }

    @Override
    public List<UserDto> findAll() {
        return userDtos;
    }

    @Override
    public UserDto save(UserDto userDto) {
        int userIndex = userDtos.indexOf(userDtos);
        if (userIndex == -1) {
            userDtos.add(userDto);
            return userDtos.get(userDtos.size() - 1);
        } else {
            return userDtos.set(userIndex, userDto);
        }
    }

}
