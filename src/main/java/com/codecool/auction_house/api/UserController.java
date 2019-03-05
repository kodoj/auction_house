package com.codecool.auction_house.api;

import com.codecool.auction_house.model.users.User;
import com.codecool.auction_house.service.UserService;

import java.math.BigDecimal;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(User user) {
        userService.addUser(user);
    }

    public User selectUser(int id) {
        return userService.selectUser(id);
    }

    public void updateUser(int id, User user) {
        userService.updateUser(id, user);
    }

    public void updateUserGold(int id, BigDecimal valueToAdd) {
        userService.updateUserGold(id, valueToAdd);
    }

    public void removeUser(int id) {
        userService.removeUser(id);
    }
}
