package com.codecool.auction_house.model.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User implements Profile{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    int id;

    @NotBlank
    private
    String login;

    @ValidEmail
    @NotNull
    @NotEmpty
    private String email;

    @NotBlank
    @Column(name = "hashed_password")
    private
    String hashedPassword;

    private BigDecimal gold = new BigDecimal(0);
    private String description;

    public User(@JsonProperty("login") String login,
                @JsonProperty("password") String hashedPassword) {
        this.login = login;
        this.hashedPassword = hashedPassword;
    }


    @Override
    public boolean authenticate(char[] password) {
        return true;
    }


    public int getId() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
