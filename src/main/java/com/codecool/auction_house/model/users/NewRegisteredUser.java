package com.codecool.auction_house.model.users;

public class NewRegisteredUser {

    private String login;
    private String password;

    public NewRegisteredUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }
}
