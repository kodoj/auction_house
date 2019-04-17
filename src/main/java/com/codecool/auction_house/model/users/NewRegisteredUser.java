package com.codecool.auction_house.model.users;

@PasswordMatcher
public class NewRegisteredUser {

    private String login;
    private String password;
    private String matchingPassword;
    @ValidEmail
    private String email;

    public NewRegisteredUser(String login, String password, String matchingPassword, String email) {
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
