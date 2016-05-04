package ru.antowka.domain;

import org.springframework.data.annotation.Id;
import java.io.Serializable;

/**
 * Created by anton on 04.05.16.
 */
class UserRole implements Serializable {

    @Id
    private int userRoleId;

    private String userRoleName;



    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }
}
