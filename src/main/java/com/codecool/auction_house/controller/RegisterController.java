package com.codecool.auction_house.controller;

import com.codecool.auction_house.model.users.NewRegisteredUser;
import com.codecool.auction_house.model.users.PasswordMatcherValidator;
import com.codecool.auction_house.model.users.User;
import com.codecool.auction_house.model.users.ValidEmail;
import com.codecool.auction_house.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;


@Controller
@RequestMapping("/register.html")
public class RegisterController {

    private final UserRepository userRepository;

    @Autowired
    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String register() {
        return "register";
    }

    @PostMapping
    public String addUser(@RequestParam String login,
                          @RequestParam String password,
                          @RequestParam String matchingPassword,
                          @RequestParam String email) {

        if (!password.equals(matchingPassword)) {
            return "passwordsDoesNotMatch";
        }
        try {
            NewRegisteredUser newRegisteredUser = new NewRegisteredUser(login, password, matchingPassword, email);
            String hashedPassword = PasswordHasher.hashPassword(newRegisteredUser.getPassword());
            User newUser = new User(newRegisteredUser.getLogin(), hashedPassword, newRegisteredUser.getEmail());
            userRepository.save(newUser);
        } catch (ConstraintViolationException e) {
            return "emailAlreadyTaken";
        }

        return "login";
    }
}