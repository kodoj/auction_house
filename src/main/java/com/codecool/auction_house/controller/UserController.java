package com.codecool.auction_house.controller;

import com.codecool.auction_house.model.users.User;
import com.codecool.auction_house.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/account.html")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
            this.userRepository = userRepository;
        }


    @GetMapping("/{id}")
    public String showUser(@PathVariable int id, Model model) {
        User loggedUser = userRepository.getOne(id);

        model.addAttribute("currentUser", loggedUser);
//        model.addAttribute("currentUserId", loggedUser.getId());
//        model.addAttribute("currentUserGold", loggedUser.getGold());

        return "account";
    }
}
