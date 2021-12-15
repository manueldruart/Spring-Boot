package be.technocite.ecarfinal.user.dao;

import be.technocite.ecarfinal.user.modele.UserDto;

import java.util.List;

public interface IUserDao {

    public UserDto findById(int id);

    public List<UserDto> findAll();

    UserDto save(UserDto save);


}
