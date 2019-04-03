package com.codecool.auction_house.controller;

import com.codecool.auction_house.model.users.User;
import com.codecool.auction_house.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/account.html")
public class UserController {

    private final UserRepository userRepository;
    private User loggedUser = null;

    @Autowired
    public UserController(UserRepository userRepository) {
            this.userRepository = userRepository;
        }


    @GetMapping("/{id}")
    public String showUser(@PathVariable int id, Model model) {
        loggedUser = userRepository.getOne(id);
        model.addAttribute("currentUser", loggedUser);

        return "account";
    }

    @PostMapping
    public String deleteAccount(@RequestParam("deleteButton")String[] checkboxValue) {

        if(checkboxValue[0] != null) {
            userRepository.deleteById(loggedUser.getId());
            loggedUser = null;
            return "login";
        }

        return "account";
    }

    private void checkingAccess(int id) {
        if(loggedUser == null) {
            loggedUser = userRepository.getOne(id);
        }
    }
}