package ru.antowka.domain;

import org.springframework.data.annotation.Id;
import java.io.Serializable;
import java.util.List;

/**
 * Created by anton on 04.05.16.
 */
public class User implements Serializable{

    @Id
    private int userId;

    private String login;

    private String password;

    private List<UserRole> role;

    private String name;



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserRole> getRole() {
        return role;
    }

    public void setRole(List<UserRole> role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
