package com.codecool.auction_house.controller;

import com.codecool.auction_house.model.users.NewRegisteredUser;
import com.codecool.auction_house.model.users.User;
import com.codecool.auction_house.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class RegisterController {

    private final
    UserRepository userRepository;

    @Autowired
    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @PostMapping("/register")
    public String addUser(@RequestBody NewRegisteredUser user) {
        String hashedPassword = PasswordHasher.hashPassword(user.getPassword());
        User newUser = new User(user.getLogin(), hashedPassword, user.getEmail());
        try {
            userRepository.save(newUser);
        } catch (DataIntegrityViolationException e) {
            return "this email is already registered";
        }

        return "User added succesfully";
    }
}