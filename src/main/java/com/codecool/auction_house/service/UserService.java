package com.codecool.auction_house.service;

import com.codecool.auction_house.dao.UserDao;
import com.codecool.auction_house.model.users.User;

import java.math.BigDecimal;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser(User user) {
        userDao.insertUser(user);
    }

    public User selectUser(int id) {
        return userDao.selectUser(id);
    }

    public void updateUser(int id, User user) {
        userDao.updateUser(id, user);
    }

    public void updateUserGold(int id, BigDecimal valueToAdd) {
        userDao.updateUserGold(id, valueToAdd);
    }

    public void removeUser(int id) {
        userDao.removeUser(id);
    }
}
