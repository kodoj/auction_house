package com.codecool.auction_house.model.users;

public class NewRegisteredUser {

    private String login;
    private String password;

    private String matchingPassword;
    @ValidEmail
    private String email;

    public NewRegisteredUser(String login, String password, String email) {
        this.login = login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }
}
