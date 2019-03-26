package com.codecool.auction_house.controller;

import com.codecool.auction_house.model.users.User;
import com.codecool.auction_house.repository.UserRepository;
import com.codecool.auction_house.specifications.SearchCriteria;
import com.codecool.auction_house.specifications.UserSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/login.html")
public class LoginController {

    private final UserRepository userRepository;

    @Autowired
    public LoginController(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

    @GetMapping
    public String login() {
        return "login";
    }

    @PostMapping
    public String logIn(@RequestParam String login,
                        @RequestParam String password) {
        String hashedPassword = PasswordHasher.hashPassword(password);

        UserSpecification spec1 = new UserSpecification(new SearchCriteria("login", ":", login));
        UserSpecification spec2 = new UserSpecification(new SearchCriteria("hashedPassword", ":", hashedPassword));

        List<User> result = userRepository.findAll(Specification.where(spec1).and(spec2));

        if(result.size() > 0) {
            User foundUser = result.get(0);
            return "User found";
        }
        return "login";
    }
}
