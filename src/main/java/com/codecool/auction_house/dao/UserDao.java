package com.codecool.auction_house.dao;

import com.codecool.auction_house.model.users.User;

import java.math.BigDecimal;

public interface UserDao {

    void insertUser(User user);

    User selectUser(int id);

    void updateUser(int id, User user);

    void updateUserGold(int id, BigDecimal valueToAdd);

    void removeUser(int id);
}
