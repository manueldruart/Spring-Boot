package be.technocite.ecarfinal.user.service;

import be.technocite.ecarfinal.user.dao.IUserDao;
import be.technocite.ecarfinal.userapi.dto.UserBuyerDto;
import be.technocite.ecarfinal.userapi.dto.UserRetailerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private IUserDao dao;

    @Autowired
    private UserBuyerDto userBuyerDto;

    @Autowired
    private UserRetailerDto userRetailerDto;

    public List<UserBuyerDto> getAllUsers() {
        return dao.findAll()
                .stream()
                .map(buyerConverter)
                .collect(Collectors.toList())
    }

    public UserBuyerDto getUserById(int id) {
        return buyerConverter.apply(dao.findById(id));
    }


}
