package com.codecool.auction_house.model.users;

import java.math.BigDecimal;
import java.util.Objects;

public class User implements Profile{

    Long id;
    String login;
    String hashedPassword;
    BigDecimal gold = new BigDecimal(0);
    String description;

    @Override
    public boolean authenticate(char[] password) {
        return true;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public BigDecimal getGold() {
        return gold;
    }

    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) &&
                Objects.equals(getLogin(), user.getLogin()) &&
                Objects.equals(getHashedPassword(), user.getHashedPassword()) &&
                Objects.equals(getGold(), user.getGold()) &&
                Objects.equals(getDescription(), user.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLogin(), getHashedPassword(), getGold(), getDescription());
    }
}
