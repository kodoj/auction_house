package com.codecool.auction_house.api;

import com.codecool.auction_house.model.users.User;
import com.codecool.auction_house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RequestMapping("/register")
@RestController
public class RegisterController {

    private final UserService userService;

    @Autowired
    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping("/register/{login}{password}")
    public void addUser(@PathVariable String login, @PathVariable String password) {
        String hashedPassword = hashPassword(password);
        userService.addUser(user);
    }

}
