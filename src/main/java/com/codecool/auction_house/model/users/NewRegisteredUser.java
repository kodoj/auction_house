package com.codecool.auction_house.model.users;

import com.fasterxml.jackson.annotation.JsonProperty;

@PasswordMatcher
public class NewRegisteredUser {

    private String login;
    private String password;
    private String matchingPassword;
    private String email;

    public NewRegisteredUser(@JsonProperty("login") String login,
                             @JsonProperty("password") String password,
                             @JsonProperty("matchingPassword") String matchingPassword,
                             @JsonProperty("email") String email) {
        this.login = login;
        this.password = password;
        this.matchingPassword = matchingPassword;
        this.email = email;
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
