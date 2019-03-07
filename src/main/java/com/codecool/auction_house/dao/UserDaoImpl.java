package com.codecool.auction_house.dao;

import com.codecool.auction_house.model.users.User;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

//@Repository("UserDaoPostgres")
public class UserDaoImpl implements UserDao{


    @Override
    public void insertUser(User user) {

    }

    @Override
    public User selectUser(int id) {
        return null;
    }

    @Override
    public void updateUser(int id, User user) {

    }

    @Override
    public void updateUserGold(int id, BigDecimal valueToAdd) {

    }

    @Override
    public void removeUser(int id) {

    }
}
