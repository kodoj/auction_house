package com.codecool.auction_house.controller;

import com.codecool.auction_house.model.users.User;
import com.codecool.auction_house.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
            this.userRepository = userRepository;
        }


//    @GetMapping("/delete")
//    public User findUser() {
//
//    }
}
