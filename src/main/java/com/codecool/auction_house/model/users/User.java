package com.codecool.auction_house.model.users;

import java.math.BigDecimal;

public class User implements Profile{

    String login;
    String hashedPassword;
    BigDecimal gold = new BigDecimal(0);
    String description;

    @Override
    public boolean authenticate(char[] password) {
        return true;
    }
}
