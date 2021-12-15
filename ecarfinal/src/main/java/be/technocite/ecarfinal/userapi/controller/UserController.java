package be.technocite.ecarfinal.userapi.controller;


import be.technocite.ecarfinal.user.service.UserService;
import be.technocite.ecarfinal.userapi.dto.UserBuyerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "${spring.data.rest.base-path}/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserBuyerDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<UserBuyerDto> getUserById(@PathVariable int id) {
        UserBuyerDto userBuyerDto = userService.getUserById(id);

        if (userBuyerDto != null) return ResponseEntity.ok().body(userBuyerDto);
        else return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<UserBuyerDto> deleteUser(@PathVariable int id) {
        if (userService.delete(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
