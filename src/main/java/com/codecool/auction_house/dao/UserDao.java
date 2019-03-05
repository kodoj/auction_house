package com.codecool.auction_house.dao;

import com.codecool.auction_house.model.users.User;

public interface UserDao {

    void insertUser(User user);

    User selectUser(int id);

    void removeUser(int id);
}
