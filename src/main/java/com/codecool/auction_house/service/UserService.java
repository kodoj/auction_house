package com.codecool.auction_house.service;

import com.codecool.auction_house.dao.UserDao;
import com.codecool.auction_house.model.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("UserDaoPostgres") UserDao userDao) {
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
